package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import org.bouncycastle.util.encoders.a;
/* renamed from: ox7  reason: default package */
/* loaded from: classes3.dex */
public class ox7 extends BufferedReader {
    public ox7(Reader reader) {
        super(reader);
    }

    private lx7 a(String str) throws IOException {
        String readLine;
        String str2 = "-----END " + str;
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        while (true) {
            readLine = readLine();
            if (readLine == null) {
                break;
            } else if (readLine.indexOf(":") >= 0) {
                int indexOf = readLine.indexOf(58);
                arrayList.add(new kx7(readLine.substring(0, indexOf), readLine.substring(indexOf + 1).trim()));
            } else if (readLine.indexOf(str2) != -1) {
                break;
            } else {
                stringBuffer.append(readLine.trim());
            }
        }
        if (readLine != null) {
            return new lx7(str, arrayList, a.a(stringBuffer.toString()));
        }
        throw new IOException(str2 + " not found");
    }

    public lx7 b() throws IOException {
        String readLine;
        String substring;
        int indexOf;
        do {
            readLine = readLine();
            if (readLine == null) {
                break;
            }
        } while (!readLine.startsWith("-----BEGIN "));
        if (readLine != null && (indexOf = (substring = readLine.substring(11)).indexOf(45)) > 0 && substring.endsWith("-----") && substring.length() - indexOf == 5) {
            return a(substring.substring(0, indexOf));
        }
        return null;
    }
}
