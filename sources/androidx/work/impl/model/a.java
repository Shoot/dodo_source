package androidx.work.impl.model;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.work.impl.model.WorkSpec;
import defpackage.b7c;
import java.util.List;
/* compiled from: WorkSpecDao.java */
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public interface a {
    void a(String str);

    List<WorkSpec> b(long j);

    void c(WorkSpec workSpec);

    List<WorkSpec> d();

    List<String> e(@NonNull String str);

    b7c.a f(String str);

    WorkSpec g(String str);

    List<String> h(@NonNull String str);

    List<androidx.work.b> i(String str);

    List<WorkSpec> j(int i);

    int k();

    int l(@NonNull String str, long j);

    List<WorkSpec.b> m(String str);

    List<WorkSpec> n(int i);

    void o(String str, androidx.work.b bVar);

    List<WorkSpec> p();

    boolean q();

    int r(String str);

    int s(String str);

    void t(String str, long j);

    int u(b7c.a aVar, String... strArr);
}
