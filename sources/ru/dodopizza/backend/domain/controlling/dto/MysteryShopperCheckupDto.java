package ru.dodopizza.backend.domain.controlling.dto;

import java.util.List;
import kotlin.Metadata;
/* compiled from: MysteryShopperCheckupDto.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001%BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006&"}, d2 = {"Lru/dodopizza/backend/domain/controlling/dto/MysteryShopperCheckupDto;", "", "showCheckup", "", "productName", "", "formLink", "cardTitle", "cardBody", "", "Lru/dodopizza/backend/domain/controlling/dto/MysteryShopperCheckupDto$CardBodyBlockDto;", "buttonTitle", "buttonEnabled", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V", "getButtonEnabled", "()Z", "getButtonTitle", "()Ljava/lang/String;", "getCardBody", "()Ljava/util/List;", "getCardTitle", "getFormLink", "getProductName", "getShowCheckup", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "CardBodyBlockDto", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MysteryShopperCheckupDto {
    @uca("buttonEnabled")
    private final boolean buttonEnabled;
    @uca("buttonTitle")
    private final String buttonTitle;
    @uca("cardBody")
    private final List<CardBodyBlockDto> cardBody;
    @uca("cardTitle")
    private final String cardTitle;
    @uca("formLink")
    private final String formLink;
    @uca("productName")
    private final String productName;
    @uca("showCheckup")
    private final boolean showCheckup;

    /* compiled from: MysteryShopperCheckupDto.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lru/dodopizza/backend/domain/controlling/dto/MysteryShopperCheckupDto$CardBodyBlockDto;", "", "blockType", "", "iconUrl", "text", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBlockType", "()Ljava/lang/String;", "getIconUrl", "getText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CardBodyBlockDto {
        @uca("blockType")
        private final String blockType;
        @uca("iconUrl")
        private final String iconUrl;
        @uca("text")
        private final String text;

        public CardBodyBlockDto(String str, String str2, String str3) {
            z65.h(str, "blockType");
            z65.h(str2, "iconUrl");
            z65.h(str3, "text");
            this.blockType = str;
            this.iconUrl = str2;
            this.text = str3;
        }

        public static /* synthetic */ CardBodyBlockDto copy$default(CardBodyBlockDto cardBodyBlockDto, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cardBodyBlockDto.blockType;
            }
            if ((i & 2) != 0) {
                str2 = cardBodyBlockDto.iconUrl;
            }
            if ((i & 4) != 0) {
                str3 = cardBodyBlockDto.text;
            }
            return cardBodyBlockDto.copy(str, str2, str3);
        }

        public final String component1() {
            return this.blockType;
        }

        public final String component2() {
            return this.iconUrl;
        }

        public final String component3() {
            return this.text;
        }

        public final CardBodyBlockDto copy(String str, String str2, String str3) {
            z65.h(str, "blockType");
            z65.h(str2, "iconUrl");
            z65.h(str3, "text");
            return new CardBodyBlockDto(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardBodyBlockDto)) {
                return false;
            }
            CardBodyBlockDto cardBodyBlockDto = (CardBodyBlockDto) obj;
            if (z65.c(this.blockType, cardBodyBlockDto.blockType) && z65.c(this.iconUrl, cardBodyBlockDto.iconUrl) && z65.c(this.text, cardBodyBlockDto.text)) {
                return true;
            }
            return false;
        }

        public final String getBlockType() {
            return this.blockType;
        }

        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return (((this.blockType.hashCode() * 31) + this.iconUrl.hashCode()) * 31) + this.text.hashCode();
        }

        public String toString() {
            String str = this.blockType;
            String str2 = this.iconUrl;
            String str3 = this.text;
            return "CardBodyBlockDto(blockType=" + str + ", iconUrl=" + str2 + ", text=" + str3 + ")";
        }
    }

    public MysteryShopperCheckupDto(boolean z, String str, String str2, String str3, List<CardBodyBlockDto> list, String str4, boolean z2) {
        z65.h(str3, "cardTitle");
        z65.h(list, "cardBody");
        z65.h(str4, "buttonTitle");
        this.showCheckup = z;
        this.productName = str;
        this.formLink = str2;
        this.cardTitle = str3;
        this.cardBody = list;
        this.buttonTitle = str4;
        this.buttonEnabled = z2;
    }

    public static /* synthetic */ MysteryShopperCheckupDto copy$default(MysteryShopperCheckupDto mysteryShopperCheckupDto, boolean z, String str, String str2, String str3, List list, String str4, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = mysteryShopperCheckupDto.showCheckup;
        }
        if ((i & 2) != 0) {
            str = mysteryShopperCheckupDto.productName;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = mysteryShopperCheckupDto.formLink;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = mysteryShopperCheckupDto.cardTitle;
        }
        String str7 = str3;
        List<CardBodyBlockDto> list2 = list;
        if ((i & 16) != 0) {
            list2 = mysteryShopperCheckupDto.cardBody;
        }
        List list3 = list2;
        if ((i & 32) != 0) {
            str4 = mysteryShopperCheckupDto.buttonTitle;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            z2 = mysteryShopperCheckupDto.buttonEnabled;
        }
        return mysteryShopperCheckupDto.copy(z, str5, str6, str7, list3, str8, z2);
    }

    public final boolean component1() {
        return this.showCheckup;
    }

    public final String component2() {
        return this.productName;
    }

    public final String component3() {
        return this.formLink;
    }

    public final String component4() {
        return this.cardTitle;
    }

    public final List<CardBodyBlockDto> component5() {
        return this.cardBody;
    }

    public final String component6() {
        return this.buttonTitle;
    }

    public final boolean component7() {
        return this.buttonEnabled;
    }

    public final MysteryShopperCheckupDto copy(boolean z, String str, String str2, String str3, List<CardBodyBlockDto> list, String str4, boolean z2) {
        z65.h(str3, "cardTitle");
        z65.h(list, "cardBody");
        z65.h(str4, "buttonTitle");
        return new MysteryShopperCheckupDto(z, str, str2, str3, list, str4, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MysteryShopperCheckupDto)) {
            return false;
        }
        MysteryShopperCheckupDto mysteryShopperCheckupDto = (MysteryShopperCheckupDto) obj;
        if (this.showCheckup == mysteryShopperCheckupDto.showCheckup && z65.c(this.productName, mysteryShopperCheckupDto.productName) && z65.c(this.formLink, mysteryShopperCheckupDto.formLink) && z65.c(this.cardTitle, mysteryShopperCheckupDto.cardTitle) && z65.c(this.cardBody, mysteryShopperCheckupDto.cardBody) && z65.c(this.buttonTitle, mysteryShopperCheckupDto.buttonTitle) && this.buttonEnabled == mysteryShopperCheckupDto.buttonEnabled) {
            return true;
        }
        return false;
    }

    public final boolean getButtonEnabled() {
        return this.buttonEnabled;
    }

    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final List<CardBodyBlockDto> getCardBody() {
        return this.cardBody;
    }

    public final String getCardTitle() {
        return this.cardTitle;
    }

    public final String getFormLink() {
        return this.formLink;
    }

    public final String getProductName() {
        return this.productName;
    }

    public final boolean getShowCheckup() {
        return this.showCheckup;
    }

    public int hashCode() {
        int hashCode;
        int a = a91.a(this.showCheckup) * 31;
        String str = this.productName;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (a + hashCode) * 31;
        String str2 = this.formLink;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((((i2 + i) * 31) + this.cardTitle.hashCode()) * 31) + this.cardBody.hashCode()) * 31) + this.buttonTitle.hashCode()) * 31) + a91.a(this.buttonEnabled);
    }

    public String toString() {
        boolean z = this.showCheckup;
        String str = this.productName;
        String str2 = this.formLink;
        String str3 = this.cardTitle;
        List<CardBodyBlockDto> list = this.cardBody;
        String str4 = this.buttonTitle;
        boolean z2 = this.buttonEnabled;
        return "MysteryShopperCheckupDto(showCheckup=" + z + ", productName=" + str + ", formLink=" + str2 + ", cardTitle=" + str3 + ", cardBody=" + list + ", buttonTitle=" + str4 + ", buttonEnabled=" + z2 + ")";
    }
}
