package androidx.datastore.preferences.protobuf;

import ch.qos.logback.core.CoreConstants;
/* compiled from: TextFormatEscaper.java */
/* loaded from: classes.dex */
final class c1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextFormatEscaper.java */
    /* loaded from: classes.dex */
    public static class a implements b {
        final /* synthetic */ g a;

        a(g gVar) {
            this.a = gVar;
        }

        @Override // androidx.datastore.preferences.protobuf.c1.b
        public byte a(int i) {
            return this.a.d(i);
        }

        @Override // androidx.datastore.preferences.protobuf.c1.b
        public int size() {
            return this.a.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TextFormatEscaper.java */
    /* loaded from: classes.dex */
    public interface b {
        byte a(int i);

        int size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(g gVar) {
        return b(new a(gVar));
    }

    static String b(b bVar) {
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i = 0; i < bVar.size(); i++) {
            byte a2 = bVar.a(i);
            if (a2 != 34) {
                if (a2 != 39) {
                    if (a2 != 92) {
                        switch (a2) {
                            case 7:
                                sb.append("\\a");
                                continue;
                            case 8:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case 12:
                                sb.append("\\f");
                                continue;
                            case 13:
                                sb.append("\\r");
                                continue;
                            default:
                                if (a2 >= 32 && a2 <= 126) {
                                    sb.append((char) a2);
                                    continue;
                                } else {
                                    sb.append(CoreConstants.ESCAPE_CHAR);
                                    sb.append((char) (((a2 >>> 6) & 3) + 48));
                                    sb.append((char) (((a2 >>> 3) & 7) + 48));
                                    sb.append((char) ((a2 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(String str) {
        return a(g.x(str));
    }
}
