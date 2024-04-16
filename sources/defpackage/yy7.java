package defpackage;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PersistedInstallation.java */
/* renamed from: yy7  reason: default package */
/* loaded from: classes2.dex */
public class yy7 {
    private File a;
    @NonNull
    private final qv3 b;

    /* compiled from: PersistedInstallation.java */
    /* renamed from: yy7$a */
    /* loaded from: classes2.dex */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public yy7(@NonNull qv3 qv3Var) {
        this.b = qv3Var;
    }

    private File a() {
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        File filesDir = this.b.k().getFilesDir();
                        this.a = new File(filesDir, "PersistedInstallation." + this.b.o() + ".json");
                    }
                } finally {
                }
            }
        }
        return this.a;
    }

    private JSONObject c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    @NonNull
    public zy7 b(@NonNull zy7 zy7Var) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", zy7Var.d());
            jSONObject.put("Status", zy7Var.g().ordinal());
            jSONObject.put("AuthToken", zy7Var.b());
            jSONObject.put("RefreshToken", zy7Var.f());
            jSONObject.put("TokenCreationEpochInSecs", zy7Var.h());
            jSONObject.put("ExpiresInSecs", zy7Var.c());
            jSONObject.put("FisError", zy7Var.e());
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.b.k().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (!createTempFile.renameTo(a())) {
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        }
        return zy7Var;
    }

    @NonNull
    public zy7 d() {
        JSONObject c = c();
        String optString = c.optString("Fid", null);
        int optInt = c.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = c.optString("AuthToken", null);
        String optString3 = c.optString("RefreshToken", null);
        long optLong = c.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = c.optLong("ExpiresInSecs", 0L);
        return zy7.a().d(optString).g(a.values()[optInt]).b(optString2).f(optString3).h(optLong).c(optLong2).e(c.optString("FisError", null)).a();
    }
}
