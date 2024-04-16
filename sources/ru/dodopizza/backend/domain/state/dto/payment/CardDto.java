package ru.dodopizza.backend.domain.state.dto.payment;

import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CardDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/payment/CardDto;", "", "endPart", "", "expiryMonth", "expiryYear", "id", "startPart", MessageAttributes.TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEndPart", "()Ljava/lang/String;", "getExpiryMonth", "getExpiryYear", "getId", "getStartPart", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CardDto {
    @uca("endPart")
    private final String endPart;
    @uca("expiryMonth")
    private final String expiryMonth;
    @uca("expiryYear")
    private final String expiryYear;
    @uca("id")
    private final String id;
    @uca("startPart")
    private final String startPart;
    @uca(MessageAttributes.TYPE)
    private final String type;

    public CardDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ CardDto copy$default(CardDto cardDto, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardDto.endPart;
        }
        if ((i & 2) != 0) {
            str2 = cardDto.expiryMonth;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = cardDto.expiryYear;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = cardDto.id;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = cardDto.startPart;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = cardDto.type;
        }
        return cardDto.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.endPart;
    }

    public final String component2() {
        return this.expiryMonth;
    }

    public final String component3() {
        return this.expiryYear;
    }

    public final String component4() {
        return this.id;
    }

    public final String component5() {
        return this.startPart;
    }

    public final String component6() {
        return this.type;
    }

    public final CardDto copy(String str, String str2, String str3, String str4, String str5, String str6) {
        z65.h(str, "endPart");
        z65.h(str2, "expiryMonth");
        z65.h(str3, "expiryYear");
        z65.h(str4, "id");
        z65.h(str5, "startPart");
        z65.h(str6, MessageAttributes.TYPE);
        return new CardDto(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardDto)) {
            return false;
        }
        CardDto cardDto = (CardDto) obj;
        if (z65.c(this.endPart, cardDto.endPart) && z65.c(this.expiryMonth, cardDto.expiryMonth) && z65.c(this.expiryYear, cardDto.expiryYear) && z65.c(this.id, cardDto.id) && z65.c(this.startPart, cardDto.startPart) && z65.c(this.type, cardDto.type)) {
            return true;
        }
        return false;
    }

    public final String getEndPart() {
        return this.endPart;
    }

    public final String getExpiryMonth() {
        return this.expiryMonth;
    }

    public final String getExpiryYear() {
        return this.expiryYear;
    }

    public final String getId() {
        return this.id;
    }

    public final String getStartPart() {
        return this.startPart;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((this.endPart.hashCode() * 31) + this.expiryMonth.hashCode()) * 31) + this.expiryYear.hashCode()) * 31) + this.id.hashCode()) * 31) + this.startPart.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        String str = this.endPart;
        String str2 = this.expiryMonth;
        String str3 = this.expiryYear;
        String str4 = this.id;
        String str5 = this.startPart;
        String str6 = this.type;
        return "CardDto(endPart=" + str + ", expiryMonth=" + str2 + ", expiryYear=" + str3 + ", id=" + str4 + ", startPart=" + str5 + ", type=" + str6 + ")";
    }

    public CardDto(String str, String str2, String str3, String str4, String str5, String str6) {
        z65.h(str, "endPart");
        z65.h(str2, "expiryMonth");
        z65.h(str3, "expiryYear");
        z65.h(str4, "id");
        z65.h(str5, "startPart");
        z65.h(str6, MessageAttributes.TYPE);
        this.endPart = str;
        this.expiryMonth = str2;
        this.expiryYear = str3;
        this.id = str4;
        this.startPart = str5;
        this.type = str6;
    }

    public /* synthetic */ CardDto(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}
