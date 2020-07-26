package cn.chinatelecom.esurvey;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OdinApplicationTests {

    @Autowired
    StringEncryptor stringEncryptor;

    @Test
    public void encrypt() {
        String ulr = "jdbc:mysql://localhost:3306/emr_sp1?useUnicode=true&characterEncoding=utf-8&useSSL=false&allowMultiQueries=true&allowPublicKeyRetrieval=true";

        System.out.println("PWD: " + stringEncryptor.encrypt("yourpassword"));
    }


}
