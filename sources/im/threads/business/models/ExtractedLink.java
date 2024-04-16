package im.threads.business.models;

import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ExtractedLink.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lim/threads/business/models/ExtractedLink;", "", ElementGenerator.TYPE_LINK, "", "isEmail", "", "(Ljava/lang/String;Z)V", "()Z", "getLink", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExtractedLink {
    private final boolean isEmail;
    private final String link;

    public ExtractedLink(String str, boolean z) {
        this.link = str;
        this.isEmail = z;
    }

    public static /* synthetic */ ExtractedLink copy$default(ExtractedLink extractedLink, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = extractedLink.link;
        }
        if ((i & 2) != 0) {
            z = extractedLink.isEmail;
        }
        return extractedLink.copy(str, z);
    }

    public final String component1() {
        return this.link;
    }

    public final boolean component2() {
        return this.isEmail;
    }

    public final ExtractedLink copy(String str, boolean z) {
        return new ExtractedLink(str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtractedLink)) {
            return false;
        }
        ExtractedLink extractedLink = (ExtractedLink) obj;
        if (z65.c(this.link, extractedLink.link) && this.isEmail == extractedLink.isEmail) {
            return true;
        }
        return false;
    }

    public final String getLink() {
        return this.link;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        String str = this.link;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = hashCode * 31;
        boolean z = this.isEmail;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public final boolean isEmail() {
        return this.isEmail;
    }

    public String toString() {
        String str = this.link;
        boolean z = this.isEmail;
        return "ExtractedLink(link=" + str + ", isEmail=" + z + ")";
    }

    public /* synthetic */ ExtractedLink(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }
}
