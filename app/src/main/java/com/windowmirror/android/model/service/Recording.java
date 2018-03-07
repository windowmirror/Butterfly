package com.windowmirror.android.model.service;

import com.google.gson.annotations.SerializedName;

import org.joda.time.DateTime;

import java.io.Serializable;

public final class Recording implements Serializable {
    private static final long serialVersionUID = 6545620253345768732L;

    @SerializedName("UUID")
    private String uuid;

    @SerializedName("DateCreated")
    private DateTime date;

    @SerializedName("Name")
    private String name;

    @SerializedName("Transcript")
    private String transcript;

    @SerializedName("Length")
    private String length;

    public String getUuid() {
        return uuid;
    }

    public DateTime getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public String getTranscript() {
        return transcript;
    }

    public String getLength() {
        return length;
    }

    public static class Builder {
        private String name;
        private String transcript;
        private String length;
        private DateTime date;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder length(String length) {
            this.length = length;
            return this;
        }

        public Builder date(DateTime date) {
            this.date = date;
            return this;
        }

        public Builder transcript(String transcript) {
            this.transcript = transcript;
            return this;
        }

        public Recording build() {
            Recording recording = new Recording();
            recording.name = name;
            recording.length = length;
            recording.date = date;
            recording.transcript = transcript;
            return recording;
        }
    }
}