package com.inappstory.sdk.stories.ui.views.goodswidget;

import ch.qos.logback.core.CoreConstants;
/* loaded from: classes3.dex */
public class GoodsItemData {
    public String description;
    public String image;
    public String oldPrice;
    public String price;
    public Object raw;
    public String sku;
    public String title;

    public GoodsItemData(String str, String str2, String str3, String str4, String str5, String str6, Object obj) {
        this.sku = str;
        this.title = str2;
        this.description = str3;
        this.image = str4;
        this.price = str5;
        this.oldPrice = str6;
        this.raw = obj;
    }

    public String toString() {
        return "GoodsItemData{sku='" + this.sku + CoreConstants.SINGLE_QUOTE_CHAR + ", title='" + this.title + CoreConstants.SINGLE_QUOTE_CHAR + ", description='" + this.description + CoreConstants.SINGLE_QUOTE_CHAR + ", image='" + this.image + CoreConstants.SINGLE_QUOTE_CHAR + ", price='" + this.price + CoreConstants.SINGLE_QUOTE_CHAR + ", oldPrice='" + this.oldPrice + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
    }
}
