package defpackage;

import android.util.Log;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import kotlin.Metadata;
/* compiled from: FileCachingService.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\f¨\u0006\u0010"}, d2 = {"Lat3;", "Lzs3;", "", RemoteMessageConst.MessageBody.MSG, "", c.a, "", "limit", "a", "", "b", "Ljava/io/File;", "Ljava/io/File;", "cacheDirectory", "<init>", "(Ljava/io/File;)V", "analytics-kusto_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: at3  reason: default package */
/* loaded from: classes.dex */
public final class at3 implements zs3 {
    private final File a;

    public at3(File file) {
        z65.h(file, "cacheDirectory");
        this.a = file;
    }

    @Override // defpackage.zs3
    public String a(long j) {
        File file = new File(this.a, KustoStorage.KustoTable.TABLE_NAME);
        try {
            if (!file.exists()) {
                return "";
            }
            File file2 = new File(file, KustoStorage.KustoTable.TABLE_NAME);
            if (file2.length() > j) {
                b();
                return "";
            }
            FileReader fileReader = new FileReader(file2);
            String f = pcb.f(fileReader);
            fileReader.close();
            return f;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // defpackage.zs3
    public void b() {
        new File(new File(this.a, KustoStorage.KustoTable.TABLE_NAME), KustoStorage.KustoTable.TABLE_NAME).delete();
    }

    @Override // defpackage.zs3
    public boolean c(String str) {
        z65.h(str, RemoteMessageConst.MessageBody.MSG);
        File file = new File(this.a, KustoStorage.KustoTable.TABLE_NAME);
        try {
            if (!file.exists()) {
                file.mkdir();
            }
            FileWriter fileWriter = new FileWriter(new File(file, KustoStorage.KustoTable.TABLE_NAME), false);
            fileWriter.append((CharSequence) str);
            fileWriter.flush();
            fileWriter.close();
            return true;
        } catch (Exception e) {
            Log.e("FileCachingService", "error while writing to the file", e);
            return false;
        }
    }
}
