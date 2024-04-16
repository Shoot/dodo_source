package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: FontFamilyResolver.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001d\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000bø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Ljc8;", "", "Lw24;", "fontFamily", "b", "Lv34;", "fontWeight", DateTokenConverter.CONVERTER_KEY, "Lq34;", "fontStyle", "a", "(I)I", "Lr34;", "fontSynthesis", c.a, "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: jc8  reason: default package */
/* loaded from: classes.dex */
public interface jc8 {
    public static final a a = a.a;

    /* compiled from: FontFamilyResolver.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Ljc8$a;", "", "Ljc8;", "b", "Ljc8;", "a", "()Ljc8;", "Default", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: jc8$a */
    /* loaded from: classes.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final jc8 b = new C0394a();

        /* compiled from: FontFamilyResolver.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"jc8$a$a", "Ljc8;", "ui-text_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: jc8$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0394a implements jc8 {
            C0394a() {
            }

            @Override // defpackage.jc8
            public /* synthetic */ int a(int i) {
                return ic8.b(this, i);
            }

            @Override // defpackage.jc8
            public /* synthetic */ w24 b(w24 w24Var) {
                return ic8.a(this, w24Var);
            }

            @Override // defpackage.jc8
            public /* synthetic */ int c(int i) {
                return ic8.c(this, i);
            }

            @Override // defpackage.jc8
            public /* synthetic */ v34 d(v34 v34Var) {
                return ic8.d(this, v34Var);
            }
        }

        private a() {
        }

        public final jc8 a() {
            return b;
        }
    }

    int a(int i);

    w24 b(w24 w24Var);

    int c(int i);

    v34 d(v34 v34Var);
}
