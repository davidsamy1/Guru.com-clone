package com.guru.jobservice.dtos;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.UUID;

@JsonPropertyOrder({
        "team_member_id", "role", "email", "user_id", "user_name"
})

public interface TeamMemberClientView {

    UUID getTeam_member_id();

    String getRole();

    String getEmail();

    UUID getUser_id();

    String getUser_name();
}
