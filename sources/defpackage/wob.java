package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FontFamilyResolver.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lwob;", "Lcua;", "", "", c.a, "()Z", "cacheable", "a", "b", "Lwob$a;", "Lwob$b;", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: wob  reason: default package */
/* loaded from: classes.dex */
public interface wob extends cua<Object> {

    /* compiled from: FontFamilyResolver.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lwob$a;", "Lwob;", "Lcua;", "", "Lgy;", "a", "Lgy;", "getCurrent$ui_text_release", "()Lgy;", "current", "getValue", "()Ljava/lang/Object;", "value", "", c.a, "()Z", "cacheable", "<init>", "(Lgy;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: wob$a */
    /* loaded from: classes.dex */
    public static final class a implements wob, cua<Object> {
        private final gy a;

        public a(gy gyVar) {
            z65.h(gyVar, "current");
            this.a = gyVar;
        }

        @Override // defpackage.wob
        public boolean c() {
            return this.a.i();
        }

        @Override // defpackage.cua
        public Object getValue() {
            return this.a.getValue();
        }
    }

    /* compiled from: FontFamilyResolver.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lwob$b;", "Lwob;", "", "a", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "value", "", "b", "Z", c.a, "()Z", "cacheable", "<init>", "(Ljava/lang/Object;Z)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: wob$b */
    /* loaded from: classes.dex */
    public static final class b implements wob {
        private final Object a;
        private final boolean b;

        public b(Object obj, boolean z) {
            z65.h(obj, "value");
            this.a = obj;
            this.b = z;
        }

        @Override // defpackage.wob
        public boolean c() {
            return this.b;
        }

        @Override // defpackage.cua
        public Object getValue() {
            return this.a;
        }

        public /* synthetic */ b(Object obj, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i & 2) != 0 ? true : z);
        }
    }

    boolean c();
}
