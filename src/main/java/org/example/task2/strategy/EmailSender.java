package org.example.task2.strategy;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.resource.Emailv31;
import org.example.task2.Config.Config;
import org.json.JSONArray;
import org.json.JSONObject;

public class EmailSender {

    public static void sendMail(MailInfo mailInfo, String receiver) throws MailjetException, MailjetSocketTimeoutException {
        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;

        // Needed file config.properties with api_key and api_secret
        client = new MailjetClient(
                Config.get("api_key"),
                Config.get("api_secret"),
                new ClientOptions("v3.1")
        );

        request = new MailjetRequest(Emailv31.resource)
                .property(
                        Emailv31.MESSAGES,
                        new JSONArray()
                        .put(
                                new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", "kononenkonazar47@gmail.com")
                                        .put("Name", "Nazar"))
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email", receiver)
                                                .put("Name", mailInfo.getClient().getName())))
                                .put(Emailv31.Message.SUBJECT, mailInfo.getHeader())
                                .put(Emailv31.Message.HTMLPART, mailInfo.generate())));

        response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}