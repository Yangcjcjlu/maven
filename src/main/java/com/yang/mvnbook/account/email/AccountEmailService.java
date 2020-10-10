package com.yang.mvnbook.account.email;

/**
 * @author: yangcj
 * @date: 2020/10/10 5:16 下午
 * @description:
 */
public interface AccountEmailService {
    void sendEmail(String to,String subject,String htmlText) throws Exception;
}
