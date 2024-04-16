package androidx.compose.foundation.text.modifiers;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ml;
import defpackage.w24;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TextAnnotatedStringElement.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B²\u0001\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0019\u0012\b\b\u0002\u0010!\u001a\u00020\u001e\u0012\b\b\u0002\u0010$\u001a\u00020\t\u0012\b\b\u0002\u0010&\u001a\u00020\u000b\u0012\b\b\u0002\u0010(\u001a\u00020\u000b\u0012\u0016\b\u0002\u0010.\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*\u0018\u00010)\u0012\u001e\b\u0002\u00101\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010/0)\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0019\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000106ø\u0001\u0000¢\u0006\u0004\b8\u00109J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010 R\u0014\u0010(\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010 R\"\u0010.\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*\u0018\u00010)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R*\u00101\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010/0)\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u001cR\u0016\u00105\u001a\u0004\u0018\u0001028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "Lfn6;", "Leab;", "t", "node", "", "u", "", "other", "", "equals", "", "hashCode", "Lml;", c.a, "Lml;", "text", "Lrcb;", DateTokenConverter.CONVERTER_KEY, "Lrcb;", "style", "Lw24$b;", e.a, "Lw24$b;", "fontFamilyResolver", "Lkotlin/Function1;", "Lbcb;", "f", "Lkotlin/jvm/functions/Function1;", "onTextLayout", "Lgcb;", "g", "I", "overflow", Image.TYPE_HIGH, "Z", "softWrap", "i", "maxLines", "j", "minLines", "", "Lml$a;", "Ljb8;", "k", "Ljava/util/List;", "placeholders", "Lk99;", "l", "onPlaceholderLayout", "Lu9a;", Image.TYPE_MEDIUM, "Lu9a;", "selectionController", "Lcd1;", RemoteMessageConst.Notification.COLOR, "<init>", "(Lml;Lrcb;Lw24$b;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Lu9a;Lcd1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends fn6<eab> {
    private final ml c;
    private final rcb d;
    private final w24.b e;
    private final Function1<bcb, Unit> f;
    private final int g;
    private final boolean h;
    private final int i;
    private final int j;
    private final List<ml.a<jb8>> k;
    private final Function1<List<k99>, Unit> l;
    private final u9a m;

    public /* synthetic */ TextAnnotatedStringElement(ml mlVar, rcb rcbVar, w24.b bVar, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, u9a u9aVar, cd1 cd1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(mlVar, rcbVar, bVar, function1, i, z, i2, i3, list, function12, u9aVar, cd1Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        textAnnotatedStringElement.getClass();
        if (z65.c(null, null) && z65.c(this.c, textAnnotatedStringElement.c) && z65.c(this.d, textAnnotatedStringElement.d) && z65.c(this.k, textAnnotatedStringElement.k) && z65.c(this.e, textAnnotatedStringElement.e) && z65.c(this.f, textAnnotatedStringElement.f) && gcb.e(this.g, textAnnotatedStringElement.g) && this.h == textAnnotatedStringElement.h && this.i == textAnnotatedStringElement.i && this.j == textAnnotatedStringElement.j && z65.c(this.l, textAnnotatedStringElement.l) && z65.c(this.m, textAnnotatedStringElement.m)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = ((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        Function1<bcb, Unit> function1 = this.f;
        int i4 = 0;
        if (function1 != null) {
            i = function1.hashCode();
        } else {
            i = 0;
        }
        int f = (((((((((hashCode + i) * 31) + gcb.f(this.g)) * 31) + a91.a(this.h)) * 31) + this.i) * 31) + this.j) * 31;
        List<ml.a<jb8>> list = this.k;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (f + i2) * 31;
        Function1<List<k99>, Unit> function12 = this.l;
        if (function12 != null) {
            i3 = function12.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (i5 + i3) * 31;
        u9a u9aVar = this.m;
        if (u9aVar != null) {
            i4 = u9aVar.hashCode();
        }
        return (i6 + i4) * 31;
    }

    @Override // defpackage.fn6
    /* renamed from: t */
    public eab o() {
        return new eab(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, null, null);
    }

    @Override // defpackage.fn6
    /* renamed from: u */
    public void s(eab eabVar) {
        z65.h(eabVar, "node");
        eabVar.g1(eabVar.m1(null, this.d), eabVar.o1(this.c), eabVar.n1(this.d, this.k, this.j, this.i, this.h, this.e, this.g), eabVar.l1(this.f, this.l, this.m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextAnnotatedStringElement(ml mlVar, rcb rcbVar, w24.b bVar, Function1<? super bcb, Unit> function1, int i, boolean z, int i2, int i3, List<ml.a<jb8>> list, Function1<? super List<k99>, Unit> function12, u9a u9aVar, cd1 cd1Var) {
        z65.h(mlVar, "text");
        z65.h(rcbVar, "style");
        z65.h(bVar, "fontFamilyResolver");
        this.c = mlVar;
        this.d = rcbVar;
        this.e = bVar;
        this.f = function1;
        this.g = i;
        this.h = z;
        this.i = i2;
        this.j = i3;
        this.k = list;
        this.l = function12;
        this.m = u9aVar;
    }
}
