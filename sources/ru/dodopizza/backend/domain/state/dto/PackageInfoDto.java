package ru.dodopizza.backend.domain.state.dto;

import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PackageInfoDto.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001aB)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/PackageInfoDto;", "", MessageAttributes.TYPE, "Lru/dodopizza/backend/domain/state/dto/PackageTypeDto;", "availableTypes", "", "widgetData", "Lru/dodopizza/backend/domain/state/dto/PackageInfoDto$WidgetDataDto;", "(Lru/dodopizza/backend/domain/state/dto/PackageTypeDto;Ljava/util/List;Lru/dodopizza/backend/domain/state/dto/PackageInfoDto$WidgetDataDto;)V", "getAvailableTypes", "()Ljava/util/List;", "getType", "()Lru/dodopizza/backend/domain/state/dto/PackageTypeDto;", "getWidgetData", "()Lru/dodopizza/backend/domain/state/dto/PackageInfoDto$WidgetDataDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "WidgetDataDto", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PackageInfoDto {
    @uca("availableTypes")
    private final List<PackageTypeDto> availableTypes;
    @uca(MessageAttributes.TYPE)
    private final PackageTypeDto type;
    @uca("widgetData")
    private final WidgetDataDto widgetData;

    /* compiled from: PackageInfoDto.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/PackageInfoDto$WidgetDataDto;", "", "title", "", "description", "switcherTitle", "actionTitle", "actionUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActionTitle", "()Ljava/lang/String;", "getActionUrl", "getDescription", "getSwitcherTitle", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class WidgetDataDto {
        @uca("actionTitle")
        private final String actionTitle;
        @uca("actionUrl")
        private final String actionUrl;
        @uca("description")
        private final String description;
        @uca("switcherTitle")
        private final String switcherTitle;
        @uca("title")
        private final String title;

        public WidgetDataDto(String str, String str2, String str3, String str4, String str5) {
            z65.h(str, "title");
            z65.h(str2, "description");
            z65.h(str3, "switcherTitle");
            z65.h(str4, "actionTitle");
            z65.h(str5, "actionUrl");
            this.title = str;
            this.description = str2;
            this.switcherTitle = str3;
            this.actionTitle = str4;
            this.actionUrl = str5;
        }

        public static /* synthetic */ WidgetDataDto copy$default(WidgetDataDto widgetDataDto, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = widgetDataDto.title;
            }
            if ((i & 2) != 0) {
                str2 = widgetDataDto.description;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = widgetDataDto.switcherTitle;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = widgetDataDto.actionTitle;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                str5 = widgetDataDto.actionUrl;
            }
            return widgetDataDto.copy(str, str6, str7, str8, str5);
        }

        public final String component1() {
            return this.title;
        }

        public final String component2() {
            return this.description;
        }

        public final String component3() {
            return this.switcherTitle;
        }

        public final String component4() {
            return this.actionTitle;
        }

        public final String component5() {
            return this.actionUrl;
        }

        public final WidgetDataDto copy(String str, String str2, String str3, String str4, String str5) {
            z65.h(str, "title");
            z65.h(str2, "description");
            z65.h(str3, "switcherTitle");
            z65.h(str4, "actionTitle");
            z65.h(str5, "actionUrl");
            return new WidgetDataDto(str, str2, str3, str4, str5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WidgetDataDto)) {
                return false;
            }
            WidgetDataDto widgetDataDto = (WidgetDataDto) obj;
            if (z65.c(this.title, widgetDataDto.title) && z65.c(this.description, widgetDataDto.description) && z65.c(this.switcherTitle, widgetDataDto.switcherTitle) && z65.c(this.actionTitle, widgetDataDto.actionTitle) && z65.c(this.actionUrl, widgetDataDto.actionUrl)) {
                return true;
            }
            return false;
        }

        public final String getActionTitle() {
            return this.actionTitle;
        }

        public final String getActionUrl() {
            return this.actionUrl;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getSwitcherTitle() {
            return this.switcherTitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return (((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.switcherTitle.hashCode()) * 31) + this.actionTitle.hashCode()) * 31) + this.actionUrl.hashCode();
        }

        public String toString() {
            String str = this.title;
            String str2 = this.description;
            String str3 = this.switcherTitle;
            String str4 = this.actionTitle;
            String str5 = this.actionUrl;
            return "WidgetDataDto(title=" + str + ", description=" + str2 + ", switcherTitle=" + str3 + ", actionTitle=" + str4 + ", actionUrl=" + str5 + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PackageInfoDto(PackageTypeDto packageTypeDto, List<? extends PackageTypeDto> list, WidgetDataDto widgetDataDto) {
        z65.h(list, "availableTypes");
        this.type = packageTypeDto;
        this.availableTypes = list;
        this.widgetData = widgetDataDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PackageInfoDto copy$default(PackageInfoDto packageInfoDto, PackageTypeDto packageTypeDto, List list, WidgetDataDto widgetDataDto, int i, Object obj) {
        if ((i & 1) != 0) {
            packageTypeDto = packageInfoDto.type;
        }
        if ((i & 2) != 0) {
            list = packageInfoDto.availableTypes;
        }
        if ((i & 4) != 0) {
            widgetDataDto = packageInfoDto.widgetData;
        }
        return packageInfoDto.copy(packageTypeDto, list, widgetDataDto);
    }

    public final PackageTypeDto component1() {
        return this.type;
    }

    public final List<PackageTypeDto> component2() {
        return this.availableTypes;
    }

    public final WidgetDataDto component3() {
        return this.widgetData;
    }

    public final PackageInfoDto copy(PackageTypeDto packageTypeDto, List<? extends PackageTypeDto> list, WidgetDataDto widgetDataDto) {
        z65.h(list, "availableTypes");
        return new PackageInfoDto(packageTypeDto, list, widgetDataDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageInfoDto)) {
            return false;
        }
        PackageInfoDto packageInfoDto = (PackageInfoDto) obj;
        if (this.type == packageInfoDto.type && z65.c(this.availableTypes, packageInfoDto.availableTypes) && z65.c(this.widgetData, packageInfoDto.widgetData)) {
            return true;
        }
        return false;
    }

    public final List<PackageTypeDto> getAvailableTypes() {
        return this.availableTypes;
    }

    public final PackageTypeDto getType() {
        return this.type;
    }

    public final WidgetDataDto getWidgetData() {
        return this.widgetData;
    }

    public int hashCode() {
        int hashCode;
        PackageTypeDto packageTypeDto = this.type;
        int i = 0;
        if (packageTypeDto == null) {
            hashCode = 0;
        } else {
            hashCode = packageTypeDto.hashCode();
        }
        int hashCode2 = ((hashCode * 31) + this.availableTypes.hashCode()) * 31;
        WidgetDataDto widgetDataDto = this.widgetData;
        if (widgetDataDto != null) {
            i = widgetDataDto.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        PackageTypeDto packageTypeDto = this.type;
        List<PackageTypeDto> list = this.availableTypes;
        WidgetDataDto widgetDataDto = this.widgetData;
        return "PackageInfoDto(type=" + packageTypeDto + ", availableTypes=" + list + ", widgetData=" + widgetDataDto + ")";
    }
}
