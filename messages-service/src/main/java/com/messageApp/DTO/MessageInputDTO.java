package com.messageApp.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public class MessageInputDTO {

    @NotNull
    private UUID sender_id;

    @NotNull
    private UUID conversation_id;


    private String message_file;
    private String message_text;


    public MessageInputDTO(UUID sender_id, UUID conversation_id, String message_text,String message_file) {
        this.sender_id = sender_id;
        this.conversation_id = conversation_id;
        this.message_file = message_file;
        this.message_text = message_text;
    }

    public String getMessage_file() {
        return message_file;
    }

    public void setMessage_file(String message_file) {
        this.message_file = message_file;
    }

    public String getMessage_text() {
        return message_text;
    }

    public void setMessage_text(String message_text) {
        this.message_text = message_text;
    }

    public UUID getSender_id() {
        return sender_id;
    }

    public void setSender_id(UUID sender_id) {
        this.sender_id = sender_id;
    }

    public UUID getConversation_id() {
        return conversation_id;
    }

    public void setConversation_id(UUID conversation_id) {
        this.conversation_id = conversation_id;
    }
}