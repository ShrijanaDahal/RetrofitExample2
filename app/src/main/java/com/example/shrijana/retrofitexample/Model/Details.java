package com.example.shrijana.retrofitexample.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Details {

//    @SerializedName("success")
//    @Expose
//    private Boolean success;
//    @SerializedName("status_code")
//    @Expose
//    private Integer statusCode;
//    @SerializedName("message")
//    @Expose
//    private String message;
    @SerializedName("data")
    @Expose
    private List<Details> data = null;
//
//    public Boolean getSuccess() {
//        return success;
//    }
//
//    public void setSuccess(Boolean success) {
//        this.success = success;
//    }
//
//    public Integer getStatusCode() {
//        return statusCode;
//    }
//
//    public void setStatusCode(Integer statusCode) {
//        this.statusCode = statusCode;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
    public List<Details> getData() {
        return data;
    }

    public void setData(List<Details> data) {
        this.data = data;
    }
//
//    public class Datum {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("image")
        @Expose
        private String image;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("short_description")
        @Expose
        private String shortDescription;
        @SerializedName("phone")
        @Expose
        private String phone;
        @SerializedName("email")
        @Expose
        private String email;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getShortDescription() {
            return shortDescription;
        }

        public void setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
//}
