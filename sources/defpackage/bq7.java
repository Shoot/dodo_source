package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
/* compiled from: Paragraph.android.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H&J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0002H&J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004H&J\u001d\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0002H&JU\u0010#\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010!\u001a\u00020 H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J]\u0010(\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010!\u001a\u00020 H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0014\u00100\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010+R\u0014\u00102\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010+R\u0014\u00105\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00108\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u001c\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0014098&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;\u0082\u0001\u0001=ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006>À\u0006\u0001"}, d2 = {"Lbq7;", "", "", "lineIndex", "", "b", e.a, "", "visibleEnd", "f", "offset", Image.TYPE_MEDIUM, "Lkj9;", "a", "vertical", "i", "Ls67;", "position", DateTokenConverter.CONVERTER_KEY, "(J)I", "Lk99;", "n", "Lqn0;", "canvas", "Luc1;", RemoteMessageConst.Notification.COLOR, "Loga;", "shadow", "Lkab;", "textDecoration", "Lz73;", "drawStyle", "Lpc0;", "blendMode", "", "l", "(Lqn0;JLoga;Lkab;Lz73;I)V", "Lmg0;", "brush", "alpha", "j", "(Lqn0;Lmg0;FLoga;Lkab;Lz73;I)V", "getWidth", "()F", "width", "getHeight", "height", c.a, "firstBaseline", "k", "lastBaseline", Image.TYPE_HIGH, "()Z", "didExceedMaxLines", "g", "()I", "lineCount", "", "o", "()Ljava/util/List;", "placeholderRects", "Lyh;", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: bq7  reason: default package */
/* loaded from: classes.dex */
public interface bq7 {
    kj9 a(int i);

    float b(int i);

    float c();

    int d(long j);

    int e(int i);

    int f(int i, boolean z);

    int g();

    float getHeight();

    float getWidth();

    boolean h();

    int i(float f);

    void j(qn0 qn0Var, mg0 mg0Var, float f, oga ogaVar, kab kabVar, z73 z73Var, int i);

    float k();

    void l(qn0 qn0Var, long j, oga ogaVar, kab kabVar, z73 z73Var, int i);

    int m(int i);

    k99 n(int i);

    List<k99> o();
}
