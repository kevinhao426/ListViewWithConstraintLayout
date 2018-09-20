package com.individual.kehao.listviewwithconstraintlayout;

/*
 * Project Name: ListViewWithConstraintLayout
 * Package Name: com.individual.kehao.listviewwithconstraintlayout
 * File    Name: profileListItem
 * Create  By:   Ke Hao
 * Create  Time: 2018/9/20
 * Description :
 */
public class ProfileListItem {
    private String pTitle;
    private String pContent;

    public ProfileListItem(String pTitle, String pContent){
        this.pTitle = pTitle;
        this.pContent = pContent;
    }


    public String getpTitle() {
        return pTitle;
    }

    public void setpTitle(String pTitle) {
        this.pTitle = pTitle;
    }

    public String getpContent() {
        return pContent;
    }

    public void setpContent(String pContent) {
        this.pContent = pContent;
    }
}
