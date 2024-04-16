package defpackage;

import androidx.annotation.NonNull;
import androidx.work.impl.model.SystemIdInfo;
import java.util.List;
/* compiled from: SystemIdInfoDao.java */
/* renamed from: i4b  reason: default package */
/* loaded from: classes.dex */
public interface i4b {
    SystemIdInfo a(@NonNull String str);

    @NonNull
    List<String> b();

    void c(@NonNull SystemIdInfo systemIdInfo);

    void d(@NonNull String str);
}
