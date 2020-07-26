//package cn.chinatelecom.esurvey;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.Date;
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class FileInfoTest {
//    private static Logger logger = LoggerFactory.getLogger(FileInfoTest.class);
//
//
//    @Autowired
//    FileInfoDOMapper fileInfoDOMapper;
//
//    @Test
//    public void insert() {
//        FileInfoDO fileInfoDO = new FileInfoDO();
//        fileInfoDO.setReleaseId(123);
//        fileInfoDO.setQuestionnaireId(456);
//        fileInfoDO.setUserFileName("用户文件名");
//        fileInfoDO.setServerFileName("带有uuid的文件名");
//        fileInfoDO.setStateType("1");
//        fileInfoDO.setFileType("1");
//        fileInfoDO.setUuid("uuid");
//        fileInfoDO.setGmtCreate(new Date());
//        fileInfoDO.setGmtModify(new Date());
//        fileInfoDOMapper.insert(fileInfoDO);
//    }
//
//}
