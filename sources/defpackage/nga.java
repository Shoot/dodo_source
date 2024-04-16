package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Pair;
/* compiled from: ShaderBrushSpan.android.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R+\u0010\u0019\u001a\u00020\u00138\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\b\u0010\u0018R'\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Lnga;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Landroid/text/TextPaint;", "textPaint", "", "updateDrawState", "Lmga;", "a", "Lmga;", "getShaderBrush", "()Lmga;", "shaderBrush", "", "b", "F", "getAlpha", "()F", "alpha", "Lcna;", c.a, "J", "getSize-NH-jbRc", "()J", "(J)V", "size", "Lkotlin/Pair;", "Landroid/graphics/Shader;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Pair;", "cachedShader", "<init>", "(Lmga;F)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: nga  reason: default package */
/* loaded from: classes.dex */
public final class nga extends CharacterStyle implements UpdateAppearance {
    private final mga a;
    private final float b;
    private long c;
    private Pair<cna, ? extends Shader> d;

    public nga(mga mgaVar, float f) {
        z65.h(mgaVar, "shaderBrush");
        this.a = mgaVar;
        this.b = f;
        this.c = cna.b.a();
    }

    public final void a(long j) {
        this.c = j;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        Shader b;
        z65.h(textPaint, "textPaint");
        xi.a(textPaint, this.b);
        if (this.c == cna.b.a()) {
            return;
        }
        Pair<cna, ? extends Shader> pair = this.d;
        if (pair != null && cna.f(pair.c().m(), this.c)) {
            b = pair.d();
        } else {
            b = this.a.b(this.c);
        }
        textPaint.setShader(b);
        this.d = lnb.a(cna.c(this.c), b);
    }
}
