package ru.dodopizza.backend.domain.state.dto;

import java.util.Collection;
import kotlin.Metadata;
/* compiled from: PrizotekaDto.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/PrizotekaDto;", "", "title", "", "subtitle", "legalDocumentUrl", "levels", "", "Lru/dodopizza/backend/domain/state/dto/PrizotekaLevelDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;)V", "getLegalDocumentUrl", "()Ljava/lang/String;", "getLevels", "()Ljava/util/Collection;", "getSubtitle", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PrizotekaDto {
    @uca("legalDocumentUrl")
    private final String legalDocumentUrl;
    @uca("levels")
    private final Collection<PrizotekaLevelDto> levels;
    @uca("subtitle")
    private final String subtitle;
    @uca("title")
    private final String title;

    public PrizotekaDto(String str, String str2, String str3, Collection<PrizotekaLevelDto> collection) {
        z65.h(str, "title");
        z65.h(str2, "subtitle");
        z65.h(str3, "legalDocumentUrl");
        z65.h(collection, "levels");
        this.title = str;
        this.subtitle = str2;
        this.legalDocumentUrl = str3;
        this.levels = collection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PrizotekaDto copy$default(PrizotekaDto prizotekaDto, String str, String str2, String str3, Collection collection, int i, Object obj) {
        if ((i & 1) != 0) {
            str = prizotekaDto.title;
        }
        if ((i & 2) != 0) {
            str2 = prizotekaDto.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = prizotekaDto.legalDocumentUrl;
        }
        if ((i & 8) != 0) {
            collection = prizotekaDto.levels;
        }
        return prizotekaDto.copy(str, str2, str3, collection);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.legalDocumentUrl;
    }

    public final Collection<PrizotekaLevelDto> component4() {
        return this.levels;
    }

    public final PrizotekaDto copy(String str, String str2, String str3, Collection<PrizotekaLevelDto> collection) {
        z65.h(str, "title");
        z65.h(str2, "subtitle");
        z65.h(str3, "legalDocumentUrl");
        z65.h(collection, "levels");
        return new PrizotekaDto(str, str2, str3, collection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrizotekaDto)) {
            return false;
        }
        PrizotekaDto prizotekaDto = (PrizotekaDto) obj;
        if (z65.c(this.title, prizotekaDto.title) && z65.c(this.subtitle, prizotekaDto.subtitle) && z65.c(this.legalDocumentUrl, prizotekaDto.legalDocumentUrl) && z65.c(this.levels, prizotekaDto.levels)) {
            return true;
        }
        return false;
    }

    public final String getLegalDocumentUrl() {
        return this.legalDocumentUrl;
    }

    public final Collection<PrizotekaLevelDto> getLevels() {
        return this.levels;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.legalDocumentUrl.hashCode()) * 31) + this.levels.hashCode();
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.legalDocumentUrl;
        Collection<PrizotekaLevelDto> collection = this.levels;
        return "PrizotekaDto(title=" + str + ", subtitle=" + str2 + ", legalDocumentUrl=" + str3 + ", levels=" + collection + ")";
    }
}
