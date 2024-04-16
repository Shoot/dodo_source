package com.dodopizza.formbuilder.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.e1b;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: FormController.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001+B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b)\u0010*J\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0001J\u0011\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0001J\t\u0010\t\u001a\u00020\u0004H\u0096\u0001J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0016R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R2\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00040\u001bj\u0002`\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020&0%8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010'¨\u0006,"}, d2 = {"Lcom/dodopizza/formbuilder/impl/FormController;", "Li54;", "Le54;", "Lk87;", "", "a", "Lis3;", "fieldInfo", "b", DateTokenConverter.CONVERTER_KEY, "init", "Le1b;", "q", e.a, "Landroid/os/Bundle;", "outState", "p", "savedInstanceState", "r", "Lvp2;", "Lvp2;", "getContext", "()Lvp2;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lo54;", "Lo54;", "validator", "Lkotlin/Function1;", "", "Lcom/dodopizza/formbuilder/impl/ReadyToSubmit;", c.a, "Lkotlin/jvm/functions/Function1;", "getOnReadyToSubmit", "()Lkotlin/jvm/functions/Function1;", "f", "(Lkotlin/jvm/functions/Function1;)V", "onReadyToSubmit", "", "Lm54;", "()Ljava/util/Collection;", "fields", "<init>", "(Lvp2;Lo54;)V", "FieldViewState", "formbuilder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FormController implements i54, e54, k87 {
    private final vp2 a;
    private final o54 b;
    private Function1<? super Boolean, Unit> c;

    /* compiled from: FormController.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/dodopizza/formbuilder/impl/FormController$FieldViewState;", "Landroid/os/Parcelable;", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "rawValue", "id", c.a, "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "formbuilder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class FieldViewState implements Parcelable {
        public static final Parcelable.Creator<FieldViewState> CREATOR = new a();
        private final String a;
        private final String b;
        private final String c;

        /* compiled from: FormController.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class a implements Parcelable.Creator<FieldViewState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final FieldViewState createFromParcel(Parcel parcel) {
                z65.h(parcel, "parcel");
                return new FieldViewState(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final FieldViewState[] newArray(int i) {
                return new FieldViewState[i];
            }
        }

        public FieldViewState(String str, String str2, String str3) {
            z65.h(str, "rawValue");
            z65.h(str2, "id");
            z65.h(str3, "value");
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public final String c() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FieldViewState)) {
                return false;
            }
            FieldViewState fieldViewState = (FieldViewState) obj;
            if (z65.c(this.a, fieldViewState.a) && z65.c(this.b, fieldViewState.b) && z65.c(this.c, fieldViewState.c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            String str3 = this.c;
            return "FieldViewState(rawValue=" + str + ", id=" + str2 + ", value=" + str3 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            z65.h(parcel, "out");
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
        }
    }

    public FormController(vp2 vp2Var, o54 o54Var) {
        z65.h(vp2Var, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(o54Var, "validator");
        this.a = vp2Var;
        this.b = o54Var;
        this.c = e07.a;
        vp2Var.h(this);
    }

    @Override // defpackage.i54
    public void a() {
        this.a.a();
    }

    @Override // defpackage.i54
    public void b(is3 is3Var) {
        z65.h(is3Var, "fieldInfo");
        this.a.b(is3Var);
    }

    @Override // defpackage.i54
    public Collection<m54> c() {
        return this.a.c();
    }

    @Override // defpackage.i54
    public void d() {
        this.a.d();
    }

    @Override // defpackage.k87
    public void e() {
        this.c.invoke(Boolean.valueOf(this.b.a() instanceof e1b.b));
    }

    public final void f(Function1<? super Boolean, Unit> function1) {
        z65.h(function1, "<set-?>");
        this.c = function1;
    }

    @Override // defpackage.e54
    public void init() {
        for (gs3 gs3Var : this.a.f()) {
            gs3Var.b().b();
        }
        d();
    }

    @Override // defpackage.e54
    public void p(Bundle bundle) {
        z65.h(bundle, "outState");
        for (m54 m54Var : this.a.c()) {
            bundle.putParcelable(m54Var.c().getName(), new FieldViewState(m54Var.b(), m54Var.d().b(), m54Var.d().c()));
        }
    }

    @Override // defpackage.e54
    public e1b q() {
        return this.b.a();
    }

    @Override // defpackage.e54
    public void r(Bundle bundle) {
        z65.h(bundle, "savedInstanceState");
        for (gs3 gs3Var : this.a.f()) {
            FieldViewState fieldViewState = (FieldViewState) bundle.getParcelable(gs3Var.a().c().getName());
            if (fieldViewState != null) {
                gs3Var.a().a(fieldViewState.b(), new ss3(fieldViewState.a(), fieldViewState.c()));
            }
        }
    }
}
