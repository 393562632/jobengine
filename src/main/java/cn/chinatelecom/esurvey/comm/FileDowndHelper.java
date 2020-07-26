package cn.chinatelecom.esurvey.comm;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

public class FileDowndHelper {

    private static final Logger logger = LoggerFactory.getLogger(FileDowndHelper.class);

    /**
     *  构造下载实体对象
     *
     * @param fileName
     * @param fileContent
     * @param userAgent
     * @return
     */
    public static ResponseEntity<byte[]> buildResponseEntity(String fileName,
        String fileContent, String userAgent) {
        ResponseEntity<byte[]> responseEntity = null;

        try {
            byte[] uft8bom = {(byte) 0xef, (byte) 0xbb, (byte) 0xbf};
            byte[] contentByte = fileContent.getBytes("UTF-8");
            byte[] bytes = new byte[contentByte.length + uft8bom.length];
            // 构建响应
            ResponseEntity.BodyBuilder bodyBuilder = ResponseEntity.ok();
            bodyBuilder.contentLength(bytes.length);
            // 二进制数据流
            bodyBuilder.contentType(MediaType.APPLICATION_OCTET_STREAM);
            String encodeFileName = URLEncoder.encode(fileName, "UTF-8");
            // IE
            if (userAgent.indexOf("MSIE") > 0) {
                bodyBuilder
                    .header("Content-Disposition", "attachment;filename=" + encodeFileName);
            } else {
                // 直接下载
                bodyBuilder
                    .header("Content-Disposition", "attachment;filename*=UTF-8''"
                        + encodeFileName);

            }

            System.arraycopy(uft8bom, 0,
                bytes, 0, uft8bom.length);

            System.arraycopy(contentByte,
                0, bytes, uft8bom.length, contentByte.length);

            // 下载成功返回二进制流
            responseEntity = bodyBuilder.body(bytes);
        } catch (UnsupportedEncodingException e) {
            LoggerUtils.error(logger, e, "文件下载异常", fileName);
        } catch (IOException e) {
            LoggerUtils.error(logger, e, "文件下载异常", fileName);
        }

        return responseEntity;
    }

}
