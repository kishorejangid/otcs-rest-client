
package com.otcs.rest.schemas;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Member implements Properties {

    @SerializedName("birth_date")
    @Expose
    private String birthDate;
    @SerializedName("business_email")
    @Expose
    private String businessEmail;
    @SerializedName("business_fax")
    @Expose
    private String businessFax;
    @SerializedName("business_phone")
    @Expose
    private String businessPhone;
    @SerializedName("cell_phone")
    @Expose
    private String cellPhone;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("group_id")
    @Expose
    private String groupId;
    @SerializedName("home_address_1")
    @Expose
    private String homeAddress1;
    @SerializedName("home_address_2")
    @Expose
    private String homeAddress2;
    @SerializedName("home_fax")
    @Expose
    private String homeFax;
    @SerializedName("home_phone")
    @Expose
    private String homePhone;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("leader_id")
    @Expose
    private String leaderId;
    @SerializedName("middle_name")
    @Expose
    private String middleName;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("name_formatted")
    @Expose
    private String nameFormatted;
    @SerializedName("office_location")
    @Expose
    private String officeLocation;
    @SerializedName("pager")
    @Expose
    private String pager;
    @SerializedName("personal_email")
    @Expose
    private String personalEmail;
    @SerializedName("personal_interests")
    @Expose
    private String personalInterests;
    @SerializedName("personal_url_1")
    @Expose
    private String personalUrl1;
    @SerializedName("personal_url_2")
    @Expose
    private String personalUrl2;
    @SerializedName("personal_url_3")
    @Expose
    private String personalUrl3;
    @SerializedName("personal_website")
    @Expose
    private String personalWebsite;
    @SerializedName("photo_url")
    @Expose
    private String photoUrl;
    @SerializedName("time_zone")
    @Expose
    private String timeZone;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("type_name")
    @Expose
    private String typeName;

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBusinessEmail() {
        return businessEmail;
    }

    public void setBusinessEmail(String businessEmail) {
        this.businessEmail = businessEmail;
    }

    public String getBusinessFax() {
        return businessFax;
    }

    public void setBusinessFax(String businessFax) {
        this.businessFax = businessFax;
    }

    public String getBusinessPhone() {
        return businessPhone;
    }

    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getHomeAddress1() {
        return homeAddress1;
    }

    public void setHomeAddress1(String homeAddress1) {
        this.homeAddress1 = homeAddress1;
    }

    public String getHomeAddress2() {
        return homeAddress2;
    }

    public void setHomeAddress2(String homeAddress2) {
        this.homeAddress2 = homeAddress2;
    }

    public String getHomeFax() {
        return homeFax;
    }

    public void setHomeFax(String homeFax) {
        this.homeFax = homeFax;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(String leaderId) {
        this.leaderId = leaderId;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameFormatted() {
        return nameFormatted;
    }

    public void setNameFormatted(String nameFormatted) {
        this.nameFormatted = nameFormatted;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    public String getPager() {
        return pager;
    }

    public void setPager(String pager) {
        this.pager = pager;
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public String getPersonalInterests() {
        return personalInterests;
    }

    public void setPersonalInterests(String personalInterests) {
        this.personalInterests = personalInterests;
    }

    public String getPersonalUrl1() {
        return personalUrl1;
    }

    public void setPersonalUrl1(String personalUrl1) {
        this.personalUrl1 = personalUrl1;
    }

    public String getPersonalUrl2() {
        return personalUrl2;
    }

    public void setPersonalUrl2(String personalUrl2) {
        this.personalUrl2 = personalUrl2;
    }

    public String getPersonalUrl3() {
        return personalUrl3;
    }

    public void setPersonalUrl3(String personalUrl3) {
        this.personalUrl3 = personalUrl3;
    }

    public String getPersonalWebsite() {
        return personalWebsite;
    }

    public void setPersonalWebsite(String personalWebsite) {
        this.personalWebsite = personalWebsite;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

}
