package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: InAppConfigResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0013B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0005\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002HÆ\u0003J%\u0010\u0007\u001a\u00020\u00002\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0003HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R,\u0010\u0006\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcga;", "", "", "", "Lcga$a;", "component1", "operations", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/Map;", "getOperations", "()Ljava/util/Map;", "<init>", "(Ljava/util/Map;)V", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: cga  reason: default package */
/* loaded from: classes.dex */
public final class cga {
    @uca("operations")
    private final Map<String, a> operations;

    /* compiled from: InAppConfigResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcga$a;", "", "", "component1", "systemName", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getSystemName", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: cga$a */
    /* loaded from: classes.dex */
    public static final class a {
        @uca("systemName")
        private final String systemName;

        public a(String str) {
            this.systemName = str;
        }

        public static /* synthetic */ a copy$default(a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.systemName;
            }
            return aVar.copy(str);
        }

        public final String component1() {
            return this.systemName;
        }

        public final a copy(String str) {
            return new a(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && z65.c(this.systemName, ((a) obj).systemName)) {
                return true;
            }
            return false;
        }

        public final String getSystemName() {
            return this.systemName;
        }

        public int hashCode() {
            String str = this.systemName;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "OperationDtoBlank(systemName=" + this.systemName + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public cga(Map<String, a> map) {
        this.operations = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ cga copy$default(cga cgaVar, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = cgaVar.operations;
        }
        return cgaVar.copy(map);
    }

    public final Map<String, a> component1() {
        return this.operations;
    }

    public final cga copy(Map<String, a> map) {
        return new cga(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof cga) && z65.c(this.operations, ((cga) obj).operations)) {
            return true;
        }
        return false;
    }

    public final Map<String, a> getOperations() {
        return this.operations;
    }

    public int hashCode() {
        Map<String, a> map = this.operations;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public String toString() {
        return "SettingsDto(operations=" + this.operations + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
