package ru.dodopizza.app.data.dto.request;
/* loaded from: classes3.dex */
public class FeedbackBody {
    @uca("LocalityId")
    @mn3
    public String localityId;
    @uca("Message")
    @mn3
    public String message;
    @uca("OrderId")
    @mn3
    public String orderId;
    @uca("PizzeriaId")
    @mn3
    public String pizzeriaId;

    public FeedbackBody(String str, String str2, String str3, String str4) {
        this.localityId = str;
        this.orderId = str2;
        this.pizzeriaId = str3;
        this.message = str4;
    }
}
