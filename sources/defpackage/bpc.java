package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: bpc  reason: default package */
/* loaded from: classes2.dex */
public interface bpc {
    public static final bpc K4 = new upc();
    public static final bpc L4 = new uoc();
    public static final bpc M4 = new doc("continue");
    public static final bpc N4 = new doc("break");
    public static final bpc O4 = new doc("return");
    public static final bpc P4 = new tnc(Boolean.TRUE);
    public static final bpc Q4 = new tnc(Boolean.FALSE);
    public static final bpc R4 = new gpc("");

    bpc c();

    Boolean d();

    Double f();

    String g();

    Iterator<bpc> h();

    bpc t(String str, xzc xzcVar, List<bpc> list);
}
