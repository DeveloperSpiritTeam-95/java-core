package com.springboot.advance;

// Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
// SPDX-License-Identifier: Apache-2.0

// snippet-start:[pinpoint.java.pinpoint_send_voice_message_sms_voice_api.complete]

import com.amazonaws.services.pinpointsmsvoice.AmazonPinpointSMSVoice;
import com.amazonaws.services.pinpointsmsvoice.AmazonPinpointSMSVoiceClientBuilder;
import com.amazonaws.services.pinpointsmsvoice.model.SSMLMessageType;
import com.amazonaws.services.pinpointsmsvoice.model.SendVoiceMessageRequest;
import com.amazonaws.services.pinpointsmsvoice.model.VoiceMessageContent;

import java.io.IOException;


/**
 * @author prabhakar, @Date 06-09-2024
 */
public class SendMessage {

    // The AWS Region that you want to use to send the voice message. For a list of
    // AWS Regions where the Amazon Pinpoint SMS and Voice API is available, see
    // https://docs.aws.amazon.com/pinpoint-sms-voice/latest/APIReference/
    static final String region = "us-east-1";

    // The phone number that the message is sent from. The phone number that you
    // specify has to be associated with your Amazon Pinpoint account. For best
    // results, you should specify the phone number in E.164 format.
    static final String originationNumber = "+12065550110";

    // The recipient's phone number. For best results, you should specify the
    // phone number in E.164 format.
    static final String destinationNumber = "+12065550142";

    // The Amazon Polly voice that you want to use to send the message. For a list
    // of voices, see https://docs.aws.amazon.com/polly/latest/dg/voicelist.html
    static final String voiceName = "Matthew";

    // The language to use when sending the message. For a list of supported
    // languages, see
    // https://docs.aws.amazon.com/polly/latest/dg/SupportedLanguage.html
    static final String languageCode = "en-US";

    // The content of the message. This example uses SSML to customize and control
    // certain aspects of the message, such as by adding pauses and changing
    // phonation. The message can't contain any line breaks.
    static final String ssmlMessage = "<speak>This is a test message sent from "
            + "<emphasis>Amazon Pinpoint</emphasis> "
            + "using the <break strength='weak'/>AWS "
            + "SDK for Java. "
            + "<amazon:effect phonation='soft'>Thank "
            + "you for listening.</amazon:effect></speak>";

    // The phone number that you want to appear on the recipient's device. The
    // phone number that you specify has to be associated with your Amazon Pinpoint
    // account.
    static final String callerId = "+12065550199";

    // The configuration set that you want to use to send the message.
    static final String configurationSet = "ConfigSet";

    public static void main(String[] args) throws IOException {
        try {
            AmazonPinpointSMSVoice client = AmazonPinpointSMSVoiceClientBuilder.standard()
                    .withRegion(region).build();
            SendVoiceMessageRequest request = new SendVoiceMessageRequest()
                    .withCallerId(callerId)
                    .withDestinationPhoneNumber(destinationNumber)
                    .withOriginationPhoneNumber(originationNumber)
                    .withConfigurationSetName(configurationSet)
                    .withContent(new VoiceMessageContent()
                            .withSSMLMessage(new SSMLMessageType()
                                    .withLanguageCode(languageCode)
                                    .withVoiceId(voiceName)
                                    .withText(ssmlMessage)));
            client.sendVoiceMessage(request);
            System.out.println("The message was sent successfully.");
        } catch (Exception ex) {
            System.out.println("The message wasn't sent. Error message: " + ex.getMessage());
        }
    }
}

// snippet-end:[pinpoint.java.pinpoint_send_voice_message_sms_voice_api.complete]
