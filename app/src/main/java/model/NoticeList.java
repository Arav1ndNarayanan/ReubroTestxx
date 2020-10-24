package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class NoticeList {

    @SerializedName("data")
    private ArrayList<Notice> noticeList;

    public ArrayList<Notice> getNoticeArrayList() {
        return noticeList;
    }

    public void setNoticeArrayList(ArrayList<Notice> noticeArrayList) {
        this.noticeList = noticeArrayList;
    }

}