package im.threads.business.ogParser;

import kotlin.Metadata;
/* compiled from: OpenGraphParser.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u001c\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H&J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lim/threads/business/ogParser/OpenGraphParser;", "", "", "urlToParse", "Lim/threads/business/ogParser/OGData;", "getContents", "messageText", "getCachedContents", "Lks8;", "getOpenGraphParsingStream", "()Lks8;", "openGraphParsingStream", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public interface OpenGraphParser {
    OGData getCachedContents(String str);

    OGData getContents(String str);

    OGData getContents(String str, String str2);

    ks8<OGData> getOpenGraphParsingStream();
}
