package com.buoyantec.dataobject;

import java.util.Date;

public class newsDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.tn_ID
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Long tnId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.tu_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Long tuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.tnc_ID
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Long tncId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.tn_Title
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private String tnTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.tn_ViceTitle
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private String tnVicetitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.tn_TitleCole
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private String tnTitlecole;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.tn_TitleB
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Integer tnTitleb;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.tn_Orde
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Integer tnOrde;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.tn_intr
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private String tnIntr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.tn_number_OC
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Integer tnNumberOc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.tn_releaseDatetime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Date tnReleasedatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.tn_Author
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private String tnAuthor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.tn_Cover
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private String tnCover;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.tn_CreateTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Date tnCreatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.tn_delete
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Boolean tnDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.tn_midefUser
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Long tnMidefuser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.tn_midefTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Date tnMideftime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.tn_DeleteUser
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private Long tnDeleteuser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_news.tn_Content
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    private String tnContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public newsDO(Long tnId, Long tuId, Long tncId, String tnTitle, String tnVicetitle, String tnTitlecole, Integer tnTitleb, Integer tnOrde, String tnIntr, Integer tnNumberOc, Date tnReleasedatetime, String tnAuthor, String tnCover, Date tnCreatetime, Boolean tnDelete, Long tnMidefuser, Date tnMideftime, Long tnDeleteuser) {
        this.tnId = tnId;
        this.tuId = tuId;
        this.tncId = tncId;
        this.tnTitle = tnTitle;
        this.tnVicetitle = tnVicetitle;
        this.tnTitlecole = tnTitlecole;
        this.tnTitleb = tnTitleb;
        this.tnOrde = tnOrde;
        this.tnIntr = tnIntr;
        this.tnNumberOc = tnNumberOc;
        this.tnReleasedatetime = tnReleasedatetime;
        this.tnAuthor = tnAuthor;
        this.tnCover = tnCover;
        this.tnCreatetime = tnCreatetime;
        this.tnDelete = tnDelete;
        this.tnMidefuser = tnMidefuser;
        this.tnMideftime = tnMideftime;
        this.tnDeleteuser = tnDeleteuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public newsDO(Long tnId, Long tuId, Long tncId, String tnTitle, String tnVicetitle, String tnTitlecole, Integer tnTitleb, Integer tnOrde, String tnIntr, Integer tnNumberOc, Date tnReleasedatetime, String tnAuthor, String tnCover, Date tnCreatetime, Boolean tnDelete, Long tnMidefuser, Date tnMideftime, Long tnDeleteuser, String tnContent) {
        this.tnId = tnId;
        this.tuId = tuId;
        this.tncId = tncId;
        this.tnTitle = tnTitle;
        this.tnVicetitle = tnVicetitle;
        this.tnTitlecole = tnTitlecole;
        this.tnTitleb = tnTitleb;
        this.tnOrde = tnOrde;
        this.tnIntr = tnIntr;
        this.tnNumberOc = tnNumberOc;
        this.tnReleasedatetime = tnReleasedatetime;
        this.tnAuthor = tnAuthor;
        this.tnCover = tnCover;
        this.tnCreatetime = tnCreatetime;
        this.tnDelete = tnDelete;
        this.tnMidefuser = tnMidefuser;
        this.tnMideftime = tnMideftime;
        this.tnDeleteuser = tnDeleteuser;
        this.tnContent = tnContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public newsDO() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.tn_ID
     *
     * @return the value of t_news.tn_ID
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Long getTnId() {
        return tnId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.tn_ID
     *
     * @param tnId the value for t_news.tn_ID
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTnId(Long tnId) {
        this.tnId = tnId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.tu_id
     *
     * @return the value of t_news.tu_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Long getTuId() {
        return tuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.tu_id
     *
     * @param tuId the value for t_news.tu_id
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTuId(Long tuId) {
        this.tuId = tuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.tnc_ID
     *
     * @return the value of t_news.tnc_ID
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Long getTncId() {
        return tncId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.tnc_ID
     *
     * @param tncId the value for t_news.tnc_ID
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTncId(Long tncId) {
        this.tncId = tncId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.tn_Title
     *
     * @return the value of t_news.tn_Title
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public String getTnTitle() {
        return tnTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.tn_Title
     *
     * @param tnTitle the value for t_news.tn_Title
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTnTitle(String tnTitle) {
        this.tnTitle = tnTitle == null ? null : tnTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.tn_ViceTitle
     *
     * @return the value of t_news.tn_ViceTitle
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public String getTnVicetitle() {
        return tnVicetitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.tn_ViceTitle
     *
     * @param tnVicetitle the value for t_news.tn_ViceTitle
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTnVicetitle(String tnVicetitle) {
        this.tnVicetitle = tnVicetitle == null ? null : tnVicetitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.tn_TitleCole
     *
     * @return the value of t_news.tn_TitleCole
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public String getTnTitlecole() {
        return tnTitlecole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.tn_TitleCole
     *
     * @param tnTitlecole the value for t_news.tn_TitleCole
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTnTitlecole(String tnTitlecole) {
        this.tnTitlecole = tnTitlecole == null ? null : tnTitlecole.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.tn_TitleB
     *
     * @return the value of t_news.tn_TitleB
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Integer getTnTitleb() {
        return tnTitleb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.tn_TitleB
     *
     * @param tnTitleb the value for t_news.tn_TitleB
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTnTitleb(Integer tnTitleb) {
        this.tnTitleb = tnTitleb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.tn_Orde
     *
     * @return the value of t_news.tn_Orde
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Integer getTnOrde() {
        return tnOrde;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.tn_Orde
     *
     * @param tnOrde the value for t_news.tn_Orde
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTnOrde(Integer tnOrde) {
        this.tnOrde = tnOrde;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.tn_intr
     *
     * @return the value of t_news.tn_intr
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public String getTnIntr() {
        return tnIntr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.tn_intr
     *
     * @param tnIntr the value for t_news.tn_intr
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTnIntr(String tnIntr) {
        this.tnIntr = tnIntr == null ? null : tnIntr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.tn_number_OC
     *
     * @return the value of t_news.tn_number_OC
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Integer getTnNumberOc() {
        return tnNumberOc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.tn_number_OC
     *
     * @param tnNumberOc the value for t_news.tn_number_OC
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTnNumberOc(Integer tnNumberOc) {
        this.tnNumberOc = tnNumberOc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.tn_releaseDatetime
     *
     * @return the value of t_news.tn_releaseDatetime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Date getTnReleasedatetime() {
        return tnReleasedatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.tn_releaseDatetime
     *
     * @param tnReleasedatetime the value for t_news.tn_releaseDatetime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTnReleasedatetime(Date tnReleasedatetime) {
        this.tnReleasedatetime = tnReleasedatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.tn_Author
     *
     * @return the value of t_news.tn_Author
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public String getTnAuthor() {
        return tnAuthor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.tn_Author
     *
     * @param tnAuthor the value for t_news.tn_Author
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTnAuthor(String tnAuthor) {
        this.tnAuthor = tnAuthor == null ? null : tnAuthor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.tn_Cover
     *
     * @return the value of t_news.tn_Cover
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public String getTnCover() {
        return tnCover;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.tn_Cover
     *
     * @param tnCover the value for t_news.tn_Cover
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTnCover(String tnCover) {
        this.tnCover = tnCover == null ? null : tnCover.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.tn_CreateTime
     *
     * @return the value of t_news.tn_CreateTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Date getTnCreatetime() {
        return tnCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.tn_CreateTime
     *
     * @param tnCreatetime the value for t_news.tn_CreateTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTnCreatetime(Date tnCreatetime) {
        this.tnCreatetime = tnCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.tn_delete
     *
     * @return the value of t_news.tn_delete
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Boolean getTnDelete() {
        return tnDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.tn_delete
     *
     * @param tnDelete the value for t_news.tn_delete
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTnDelete(Boolean tnDelete) {
        this.tnDelete = tnDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.tn_midefUser
     *
     * @return the value of t_news.tn_midefUser
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Long getTnMidefuser() {
        return tnMidefuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.tn_midefUser
     *
     * @param tnMidefuser the value for t_news.tn_midefUser
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTnMidefuser(Long tnMidefuser) {
        this.tnMidefuser = tnMidefuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.tn_midefTime
     *
     * @return the value of t_news.tn_midefTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Date getTnMideftime() {
        return tnMideftime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.tn_midefTime
     *
     * @param tnMideftime the value for t_news.tn_midefTime
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTnMideftime(Date tnMideftime) {
        this.tnMideftime = tnMideftime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.tn_DeleteUser
     *
     * @return the value of t_news.tn_DeleteUser
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public Long getTnDeleteuser() {
        return tnDeleteuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.tn_DeleteUser
     *
     * @param tnDeleteuser the value for t_news.tn_DeleteUser
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTnDeleteuser(Long tnDeleteuser) {
        this.tnDeleteuser = tnDeleteuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_news.tn_Content
     *
     * @return the value of t_news.tn_Content
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public String getTnContent() {
        return tnContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_news.tn_Content
     *
     * @param tnContent the value for t_news.tn_Content
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    public void setTnContent(String tnContent) {
        this.tnContent = tnContent == null ? null : tnContent.trim();
    }
}