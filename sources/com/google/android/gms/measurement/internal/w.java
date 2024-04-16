package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class w extends s6 {
    private long c;
    private String d;
    private AccountManager e;
    private Boolean f;
    private long g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(u5 u5Var) {
        super(u5Var);
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ g a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ t91 b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ c d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ w e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ j4 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ w4 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ jb h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ o5 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ k4 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.s6
    protected final boolean s() {
        Calendar calendar = Calendar.getInstance();
        this.c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.d = lowerCase + "-" + lowerCase2;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long t() {
        l();
        return this.g;
    }

    public final long u() {
        o();
        return this.c;
    }

    public final String v() {
        o();
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w() {
        l();
        this.f = null;
        this.g = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean x() {
        Account[] result;
        l();
        long currentTimeMillis = b().currentTimeMillis();
        if (currentTimeMillis - this.g > CoreConstants.MILLIS_IN_ONE_DAY) {
            this.f = null;
        }
        Boolean bool = this.f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (iu1.a(zza(), "android.permission.GET_ACCOUNTS") != 0) {
            n().M().a("Permission error checking for dasher/unicorn accounts");
            this.g = currentTimeMillis;
            this.f = Boolean.FALSE;
            return false;
        }
        if (this.e == null) {
            this.e = AccountManager.get(zza());
        }
        try {
            result = this.e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
        } catch (AuthenticatorException e) {
            e = e;
            n().H().b("Exception checking account types", e);
            this.g = currentTimeMillis;
            this.f = Boolean.FALSE;
            return false;
        } catch (OperationCanceledException e2) {
            e = e2;
            n().H().b("Exception checking account types", e);
            this.g = currentTimeMillis;
            this.f = Boolean.FALSE;
            return false;
        } catch (IOException e3) {
            e = e3;
            n().H().b("Exception checking account types", e);
            this.g = currentTimeMillis;
            this.f = Boolean.FALSE;
            return false;
        }
        if (result != null && result.length > 0) {
            this.f = Boolean.TRUE;
            this.g = currentTimeMillis;
            return true;
        }
        Account[] result2 = this.e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
        if (result2 != null && result2.length > 0) {
            this.f = Boolean.TRUE;
            this.g = currentTimeMillis;
            return true;
        }
        this.g = currentTimeMillis;
        this.f = Boolean.FALSE;
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
