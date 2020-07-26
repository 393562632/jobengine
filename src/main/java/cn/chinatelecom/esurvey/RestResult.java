package cn.chinatelecom.esurvey;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Taylor
 * @version 1.0
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RestResult<T> {

    private Integer success;

    private Integer code;

    private String message;

    private T data;

    public static <T> RestResult<T> newInstance() {
        return new RestResult<>();
    }

    public static <T> RestResult<T> genResult(Integer success, Integer code, String message,
        T data) {
        return new RestResult<>(success, code, message, data);
    }

    public static <T> RestResult<T> genSuccessResult(T data) {
        return new RestResult<>(0, 200, "", data);
    }

    public static <T> RestResult<T> genSuccessResult(String message, T data) {
        return new RestResult<>(0, 200, message, data);
    }

    public static <T> RestResult<T> genFailResult(Integer code, String message) {
        return new RestResult<>(1, code, message, null);
    }

    public static <T> RestResult<T> genFailResult(String message) {
        return new RestResult<>(1, 603, message, null);
    }

    public static <T> Boolean isSucess(RestResult<T> restResult) {
        if (restResult.getSuccess() == 0) {
            return true;
        } else {
            return false;
        }
    }


}

