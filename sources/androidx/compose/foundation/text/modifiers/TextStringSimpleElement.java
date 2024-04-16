package androidx.compose.foundation.text.modifiers;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.w24;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TextStringSimpleElement.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BV\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001f\u001a\u00020\t\u0012\b\b\u0002\u0010!\u001a\u00020\u000b\u0012\b\b\u0002\u0010#\u001a\u00020\u000b\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001bR\u0014\u0010#\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "Lfn6;", "Lqcb;", "t", "node", "", "u", "", "other", "", "equals", "", "hashCode", "", c.a, "Ljava/lang/String;", "text", "Lrcb;", DateTokenConverter.CONVERTER_KEY, "Lrcb;", "style", "Lw24$b;", e.a, "Lw24$b;", "fontFamilyResolver", "Lgcb;", "f", "I", "overflow", "g", "Z", "softWrap", Image.TYPE_HIGH, "maxLines", "i", "minLines", "Lcd1;", RemoteMessageConst.Notification.COLOR, "<init>", "(Ljava/lang/String;Lrcb;Lw24$b;IZIILcd1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends fn6<qcb> {
    private final String c;
    private final rcb d;
    private final w24.b e;
    private final int f;
    private final boolean g;
    private final int h;
    private final int i;

    public /* synthetic */ TextStringSimpleElement(String str, rcb rcbVar, w24.b bVar, int i, boolean z, int i2, int i3, cd1 cd1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, rcbVar, bVar, i, z, i2, i3, cd1Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        textStringSimpleElement.getClass();
        if (z65.c(null, null) && z65.c(this.c, textStringSimpleElement.c) && z65.c(this.d, textStringSimpleElement.d) && z65.c(this.e, textStringSimpleElement.e) && gcb.e(this.f, textStringSimpleElement.f) && this.g == textStringSimpleElement.g && this.h == textStringSimpleElement.h && this.i == textStringSimpleElement.i) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + gcb.f(this.f)) * 31) + a91.a(this.g)) * 31) + this.h) * 31) + this.i) * 31;
    }

    @Override // defpackage.fn6
    /* renamed from: t */
    public qcb o() {
        return new qcb(this.c, this.d, this.e, this.f, this.g, this.h, this.i, null, null);
    }

    @Override // defpackage.fn6
    /* renamed from: u */
    public void s(qcb qcbVar) {
        z65.h(qcbVar, "node");
        qcbVar.g1(qcbVar.j1(null, this.d), qcbVar.l1(this.c), qcbVar.k1(this.d, this.i, this.h, this.g, this.e, this.f));
    }

    private TextStringSimpleElement(String str, rcb rcbVar, w24.b bVar, int i, boolean z, int i2, int i3, cd1 cd1Var) {
        z65.h(str, "text");
        z65.h(rcbVar, "style");
        z65.h(bVar, "fontFamilyResolver");
        this.c = str;
        this.d = rcbVar;
        this.e = bVar;
        this.f = i;
        this.g = z;
        this.h = i2;
        this.i = i3;
    }
}
