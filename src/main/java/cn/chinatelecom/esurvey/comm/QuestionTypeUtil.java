package cn.chinatelecom.esurvey.comm;

import java.util.ArrayList;
import java.util.List;

public class QuestionTypeUtil {


    public static boolean isChoice(String questionType) {

        if (QuestionTypeEnum.SingleChoice.getCode().equals(questionType)
            || QuestionTypeEnum.MutiChoice.getCode().equals(questionType)
            || QuestionTypeEnum.DropList.getCode().equals(questionType)
            ) {
            return true;
        }

        return false;
    }

    public static boolean isText(String questionType) {
        if (QuestionTypeEnum.Text.getCode().equals(questionType)
            || QuestionTypeEnum.MutiText.getCode().equals(questionType)
            || QuestionTypeEnum.DateTime.getCode().equals(questionType)||QuestionTypeEnum.UploadFile.equals(questionType)) {
            return true;
        }

        return false;
    }

    public static boolean isFile(String questionType) {
        if (QuestionTypeEnum.UploadFile.getCode().equals(questionType)) {

            return true;
        }

        return false;
    }

    public static List<String> buildChoiceTypeList() {
        List<String> typeList = new ArrayList<>();
        typeList.add(QuestionTypeEnum.SingleChoice.getCode());
        typeList.add(QuestionTypeEnum.MutiChoice.getCode());
        typeList.add(QuestionTypeEnum.DropList.getCode());

        return typeList;
    }

    public static List<String> buildTextTypeList() {
        List<String> typeList = new ArrayList<>();
        typeList.add(QuestionTypeEnum.MutiText.getCode());
        typeList.add(QuestionTypeEnum.Text.getCode());
        typeList.add(QuestionTypeEnum.DateTime.getCode());
        //typeList.add(QuestionTypeEnum.UploadFile.getCode());
        return typeList;
    }
}
