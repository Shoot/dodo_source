package defpackage;

import android.util.Base64;
import android.util.JsonReader;
import androidx.annotation.NonNull;
import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.push.constant.RemoteMessageConst;
import defpackage.j12;
import im.threads.business.transport.MessageAttributes;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: CrashlyticsReportJsonTransform.java */
/* renamed from: u12 */
/* loaded from: classes2.dex */
public class u12 {
    private static final tk2 a = new ja5().j(u00.a).k(true).i();

    /* compiled from: CrashlyticsReportJsonTransform.java */
    /* renamed from: u12$a */
    /* loaded from: classes2.dex */
    public interface a<T> {
        T a(@NonNull JsonReader jsonReader) throws IOException;
    }

    @NonNull
    private static j12.e.d.f A(@NonNull JsonReader jsonReader) throws IOException {
        j12.e.d.f.a a2 = j12.e.d.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("assignments")) {
                jsonReader.skipValue();
            } else {
                a2.b(n(jsonReader, new a() { // from class: n12
                    @Override // defpackage.u12.a
                    public final Object a(JsonReader jsonReader2) {
                        j12.e.d.AbstractC0389e z;
                        z = u12.z(jsonReader2);
                        return z;
                    }
                }));
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @NonNull
    private static j12.e.d.a.b.AbstractC0381d B(@NonNull JsonReader jsonReader) throws IOException {
        j12.e.d.a.b.AbstractC0381d.AbstractC0382a a2 = j12.e.d.a.b.AbstractC0381d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1147692044:
                    if (nextName.equals("address")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3059181:
                    if (nextName.equals("code")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals(Action.NAME_ATTRIBUTE)) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.b(jsonReader.nextLong());
                    break;
                case 1:
                    a2.c(jsonReader.nextString());
                    break;
                case 2:
                    a2.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @NonNull
    public static j12.e.d.a.b.AbstractC0383e C(@NonNull JsonReader jsonReader) throws IOException {
        j12.e.d.a.b.AbstractC0383e.AbstractC0384a a2 = j12.e.d.a.b.AbstractC0383e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals(Action.NAME_ATTRIBUTE)) {
                        c = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.b(n(jsonReader, new t12()));
                    break;
                case 1:
                    a2.d(jsonReader.nextString());
                    break;
                case 2:
                    a2.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @NonNull
    public static j12.d.b D(@NonNull JsonReader jsonReader) throws IOException {
        j12.d.b.a a2 = j12.d.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("filename")) {
                if (!nextName.equals("contents")) {
                    jsonReader.skipValue();
                } else {
                    a2.b(Base64.decode(jsonReader.nextString(), 2));
                }
            } else {
                a2.c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @NonNull
    private static j12.d E(@NonNull JsonReader jsonReader) throws IOException {
        j12.d.a a2 = j12.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("files")) {
                if (!nextName.equals("orgId")) {
                    jsonReader.skipValue();
                } else {
                    a2.c(jsonReader.nextString());
                }
            } else {
                a2.b(n(jsonReader, new a() { // from class: m12
                    @Override // defpackage.u12.a
                    public final Object a(JsonReader jsonReader2) {
                        j12.d.b D;
                        D = u12.D(jsonReader2);
                        return D;
                    }
                }));
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @NonNull
    private static j12.e.AbstractC0390e F(@NonNull JsonReader jsonReader) throws IOException {
        j12.e.AbstractC0390e.a a2 = j12.e.AbstractC0390e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 0;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals("jailbroken")) {
                        c = 1;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.b(jsonReader.nextString());
                    break;
                case 1:
                    a2.c(jsonReader.nextBoolean());
                    break;
                case 2:
                    a2.e(jsonReader.nextString());
                    break;
                case 3:
                    a2.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @NonNull
    public static j12.e.d.a.c G(@NonNull JsonReader jsonReader) throws IOException {
        j12.e.d.a.c.AbstractC0387a a2 = j12.e.d.a.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c = 0;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1694598382:
                    if (nextName.equals("defaultProcess")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.d(jsonReader.nextInt());
                    break;
                case 1:
                    a2.e(jsonReader.nextString());
                    break;
                case 2:
                    a2.b(jsonReader.nextBoolean());
                    break;
                case 3:
                    a2.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @NonNull
    private static j12 H(@NonNull JsonReader jsonReader) throws IOException {
        j12.b b = j12.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 3;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 4;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c = 5;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c = '\n';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    b.i(E(jsonReader));
                    break;
                case 1:
                    b.k(jsonReader.nextString());
                    break;
                case 2:
                    b.c(jsonReader.nextString());
                    break;
                case 3:
                    b.b(m(jsonReader));
                    break;
                case 4:
                    b.d(jsonReader.nextString());
                    break;
                case 5:
                    b.g(jsonReader.nextString());
                    break;
                case 6:
                    b.h(jsonReader.nextString());
                    break;
                case 7:
                    b.f(jsonReader.nextString());
                    break;
                case '\b':
                    b.j(jsonReader.nextInt());
                    break;
                case '\t':
                    b.e(jsonReader.nextString());
                    break;
                case '\n':
                    b.l(J(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b.a();
    }

    @NonNull
    private static j12.e.d.AbstractC0389e.b I(@NonNull JsonReader jsonReader) throws IOException {
        j12.e.d.AbstractC0389e.b.a a2 = j12.e.d.AbstractC0389e.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("variantId")) {
                if (!nextName.equals("rolloutId")) {
                    jsonReader.skipValue();
                } else {
                    a2.b(jsonReader.nextString());
                }
            } else {
                a2.c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @NonNull
    private static j12.e J(@NonNull JsonReader jsonReader) throws IOException {
        j12.e.b a2 = j12.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals("startedAt")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1606742899:
                    if (nextName.equals("endedAt")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals("events")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c = 6;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 7;
                        break;
                    }
                    break;
                case 3599307:
                    if (nextName.equals("user")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals("generator")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals("crashed")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 2047016109:
                    if (nextName.equals("generatorType")) {
                        c = 11;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.m(jsonReader.nextLong());
                    break;
                case 1:
                    a2.c(jsonReader.nextString());
                    break;
                case 2:
                    a2.k(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    a2.f(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 4:
                    a2.e(q(jsonReader));
                    break;
                case 5:
                    a2.g(n(jsonReader, new a() { // from class: l12
                        @Override // defpackage.u12.a
                        public final Object a(JsonReader jsonReader2) {
                            j12.e.d r;
                            r = u12.r(jsonReader2);
                            return r;
                        }
                    }));
                    break;
                case 6:
                    a2.l(F(jsonReader));
                    break;
                case 7:
                    a2.b(l(jsonReader));
                    break;
                case '\b':
                    a2.n(K(jsonReader));
                    break;
                case '\t':
                    a2.h(jsonReader.nextString());
                    break;
                case '\n':
                    a2.d(jsonReader.nextBoolean());
                    break;
                case 11:
                    a2.i(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @NonNull
    private static j12.e.f K(@NonNull JsonReader jsonReader) throws IOException {
        j12.e.f.a a2 = j12.e.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("identifier")) {
                a2.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @NonNull
    private static j12.e.a l(@NonNull JsonReader jsonReader) throws IOException {
        j12.e.a.AbstractC0375a a2 = j12.e.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 0;
                        break;
                    }
                    break;
                case -519438642:
                    if (nextName.equals("developmentPlatform")) {
                        c = 1;
                        break;
                    }
                    break;
                case 213652010:
                    if (nextName.equals("developmentPlatformVersion")) {
                        c = 2;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.e(jsonReader.nextString());
                    break;
                case 1:
                    a2.b(jsonReader.nextString());
                    break;
                case 2:
                    a2.c(jsonReader.nextString());
                    break;
                case 3:
                    a2.g(jsonReader.nextString());
                    break;
                case 4:
                    a2.f(jsonReader.nextString());
                    break;
                case 5:
                    a2.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @NonNull
    private static j12.a m(@NonNull JsonReader jsonReader) throws IOException {
        j12.a.b a2 = j12.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1516200806:
                    if (nextName.equals("buildIdMappingForArch")) {
                        c = 0;
                        break;
                    }
                    break;
                case 110987:
                    if (nextName.equals("pid")) {
                        c = 1;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c = 2;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 4;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c = 5;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c = 6;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = '\b';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.b(n(jsonReader, new a() { // from class: q12
                        @Override // defpackage.u12.a
                        public final Object a(JsonReader jsonReader2) {
                            j12.a.AbstractC0373a o;
                            o = u12.o(jsonReader2);
                            return o;
                        }
                    }));
                    break;
                case 1:
                    a2.d(jsonReader.nextInt());
                    break;
                case 2:
                    a2.f(jsonReader.nextLong());
                    break;
                case 3:
                    a2.h(jsonReader.nextLong());
                    break;
                case 4:
                    a2.i(jsonReader.nextLong());
                    break;
                case 5:
                    a2.e(jsonReader.nextString());
                    break;
                case 6:
                    a2.g(jsonReader.nextInt());
                    break;
                case 7:
                    a2.j(jsonReader.nextString());
                    break;
                case '\b':
                    a2.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @NonNull
    private static <T> List<T> n(@NonNull JsonReader jsonReader, @NonNull a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    @NonNull
    public static j12.a.AbstractC0373a o(@NonNull JsonReader jsonReader) throws IOException {
        j12.a.AbstractC0373a.AbstractC0374a a2 = j12.a.AbstractC0373a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -609862170:
                    if (nextName.equals("libraryName")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c = 1;
                        break;
                    }
                    break;
                case 230943785:
                    if (nextName.equals("buildId")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.d(jsonReader.nextString());
                    break;
                case 1:
                    a2.b(jsonReader.nextString());
                    break;
                case 2:
                    a2.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @NonNull
    public static j12.c p(@NonNull JsonReader jsonReader) throws IOException {
        j12.c.a a2 = j12.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals(Action.KEY_ATTRIBUTE)) {
                if (!nextName.equals("value")) {
                    jsonReader.skipValue();
                } else {
                    a2.c(jsonReader.nextString());
                }
            } else {
                a2.b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @NonNull
    private static j12.e.c q(@NonNull JsonReader jsonReader) throws IOException {
        j12.e.c.a a2 = j12.e.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals("simulator")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals("manufacturer")) {
                        c = 1;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals("ram")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c = 3;
                        break;
                    }
                    break;
                case 81784169:
                    if (nextName.equals("diskSpace")) {
                        c = 4;
                        break;
                    }
                    break;
                case 94848180:
                    if (nextName.equals("cores")) {
                        c = 5;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals("model")) {
                        c = 6;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals("state")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2078953423:
                    if (nextName.equals("modelClass")) {
                        c = '\b';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.i(jsonReader.nextBoolean());
                    break;
                case 1:
                    a2.e(jsonReader.nextString());
                    break;
                case 2:
                    a2.h(jsonReader.nextLong());
                    break;
                case 3:
                    a2.b(jsonReader.nextInt());
                    break;
                case 4:
                    a2.d(jsonReader.nextLong());
                    break;
                case 5:
                    a2.c(jsonReader.nextInt());
                    break;
                case 6:
                    a2.f(jsonReader.nextString());
                    break;
                case 7:
                    a2.j(jsonReader.nextInt());
                    break;
                case '\b':
                    a2.g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @NonNull
    public static j12.e.d r(@NonNull JsonReader jsonReader) throws IOException {
        j12.e.d.b a2 = j12.e.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 0;
                        break;
                    }
                    break;
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        c = 1;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 2;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals(MessageAttributes.TYPE)) {
                        c = 4;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.c(u(jsonReader));
                    break;
                case 1:
                    a2.e(A(jsonReader));
                    break;
                case 2:
                    a2.b(s(jsonReader));
                    break;
                case 3:
                    a2.d(y(jsonReader));
                    break;
                case 4:
                    a2.g(jsonReader.nextString());
                    break;
                case 5:
                    a2.f(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @NonNull
    private static j12.e.d.a s(@NonNull JsonReader jsonReader) throws IOException {
        j12.e.d.a.AbstractC0376a a2 = j12.e.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1405314732:
                    if (nextName.equals("appProcessDetails")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1332194002:
                    if (nextName.equals("background")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals("execution")) {
                        c = 2;
                        break;
                    }
                    break;
                case -80231855:
                    if (nextName.equals("internalKeys")) {
                        c = 3;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals("customAttributes")) {
                        c = 4;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals("uiOrientation")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1847730860:
                    if (nextName.equals("currentProcessDetails")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.b(n(jsonReader, new a() { // from class: p12
                        @Override // defpackage.u12.a
                        public final Object a(JsonReader jsonReader2) {
                            j12.e.d.a.c G;
                            G = u12.G(jsonReader2);
                            return G;
                        }
                    }));
                    break;
                case 1:
                    a2.c(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case 2:
                    a2.f(v(jsonReader));
                    break;
                case 3:
                    a2.g(n(jsonReader, new a() { // from class: o12
                        @Override // defpackage.u12.a
                        public final Object a(JsonReader jsonReader2) {
                            j12.c p;
                            p = u12.p(jsonReader2);
                            return p;
                        }
                    }));
                    break;
                case 4:
                    a2.e(n(jsonReader, new a() { // from class: o12
                        @Override // defpackage.u12.a
                        public final Object a(JsonReader jsonReader2) {
                            j12.c p;
                            p = u12.p(jsonReader2);
                            return p;
                        }
                    }));
                    break;
                case 5:
                    a2.h(jsonReader.nextInt());
                    break;
                case 6:
                    a2.d(G(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @NonNull
    public static j12.e.d.a.b.AbstractC0377a t(@NonNull JsonReader jsonReader) throws IOException {
        j12.e.d.a.b.AbstractC0377a.AbstractC0378a a2 = j12.e.d.a.b.AbstractC0377a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals(Action.NAME_ATTRIBUTE)) {
                        c = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals(MessageAttributes.UUID)) {
                        c = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.c(jsonReader.nextString());
                    break;
                case 1:
                    a2.d(jsonReader.nextLong());
                    break;
                case 2:
                    a2.f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    a2.b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @NonNull
    private static j12.e.d.c u(@NonNull JsonReader jsonReader) throws IOException {
        j12.e.d.c.a a2 = j12.e.d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1708606089:
                    if (nextName.equals("batteryLevel")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1455558134:
                    if (nextName.equals("batteryVelocity")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals("orientation")) {
                        c = 2;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals("diskUsed")) {
                        c = 3;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals("ramUsed")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals("proximityOn")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case 1:
                    a2.c(jsonReader.nextInt());
                    break;
                case 2:
                    a2.e(jsonReader.nextInt());
                    break;
                case 3:
                    a2.d(jsonReader.nextLong());
                    break;
                case 4:
                    a2.g(jsonReader.nextLong());
                    break;
                case 5:
                    a2.f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @NonNull
    private static j12.e.d.a.b v(@NonNull JsonReader jsonReader) throws IOException {
        j12.e.d.a.b.AbstractC0379b a2 = j12.e.d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1337936983:
                    if (nextName.equals("threads")) {
                        c = 1;
                        break;
                    }
                    break;
                case -902467928:
                    if (nextName.equals("signal")) {
                        c = 2;
                        break;
                    }
                    break;
                case 937615455:
                    if (nextName.equals("binaries")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1481625679:
                    if (nextName.equals("exception")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.b(m(jsonReader));
                    break;
                case 1:
                    a2.f(n(jsonReader, new a() { // from class: r12
                        @Override // defpackage.u12.a
                        public final Object a(JsonReader jsonReader2) {
                            j12.e.d.a.b.AbstractC0383e C;
                            C = u12.C(jsonReader2);
                            return C;
                        }
                    }));
                    break;
                case 2:
                    a2.e(B(jsonReader));
                    break;
                case 3:
                    a2.c(n(jsonReader, new a() { // from class: s12
                        @Override // defpackage.u12.a
                        public final Object a(JsonReader jsonReader2) {
                            j12.e.d.a.b.AbstractC0377a t;
                            t = u12.t(jsonReader2);
                            return t;
                        }
                    }));
                    break;
                case 4:
                    a2.d(w(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @NonNull
    private static j12.e.d.a.b.c w(@NonNull JsonReader jsonReader) throws IOException {
        j12.e.d.a.b.c.AbstractC0380a a2 = j12.e.d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals(MessageAttributes.TYPE)) {
                        c = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.c(n(jsonReader, new t12()));
                    break;
                case 1:
                    a2.e(jsonReader.nextString());
                    break;
                case 2:
                    a2.f(jsonReader.nextString());
                    break;
                case 3:
                    a2.b(w(jsonReader));
                    break;
                case 4:
                    a2.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @NonNull
    public static j12.e.d.a.b.AbstractC0383e.AbstractC0385b x(@NonNull JsonReader jsonReader) throws IOException {
        j12.e.d.a.b.AbstractC0383e.AbstractC0385b.AbstractC0386a a2 = j12.e.d.a.b.AbstractC0383e.AbstractC0385b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals(Action.FILE_ATTRIBUTE)) {
                        c = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.d(jsonReader.nextLong());
                    break;
                case 1:
                    a2.f(jsonReader.nextString());
                    break;
                case 2:
                    a2.e(jsonReader.nextLong());
                    break;
                case 3:
                    a2.b(jsonReader.nextString());
                    break;
                case 4:
                    a2.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @NonNull
    private static j12.e.d.AbstractC0388d y(@NonNull JsonReader jsonReader) throws IOException {
        j12.e.d.AbstractC0388d.a a2 = j12.e.d.AbstractC0388d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals(RemoteMessageConst.Notification.CONTENT)) {
                a2.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @NonNull
    public static j12.e.d.AbstractC0389e z(@NonNull JsonReader jsonReader) throws IOException {
        j12.e.d.AbstractC0389e.a a2 = j12.e.d.AbstractC0389e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1536268810:
                    if (nextName.equals("parameterKey")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1027290370:
                    if (nextName.equals("templateVersion")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1098747284:
                    if (nextName.equals("rolloutVariant")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1124454216:
                    if (nextName.equals("parameterValue")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a2.b(jsonReader.nextString());
                    break;
                case 1:
                    a2.e(jsonReader.nextLong());
                    break;
                case 2:
                    a2.d(I(jsonReader));
                    break;
                case 3:
                    a2.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    @NonNull
    public j12 L(@NonNull String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            j12 H = H(jsonReader);
            jsonReader.close();
            return H;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    @NonNull
    public String M(@NonNull j12 j12Var) {
        return a.encode(j12Var);
    }

    @NonNull
    public j12.e.d j(@NonNull String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            j12.e.d r = r(jsonReader);
            jsonReader.close();
            return r;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    @NonNull
    public String k(@NonNull j12.e.d dVar) {
        return a.encode(dVar);
    }
}
