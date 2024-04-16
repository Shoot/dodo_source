package im.threads.business.rest.models;

import im.threads.business.transport.models.ContentAttachmentSettings;
import im.threads.business.transport.models.ContentScheduleInfoContent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ConfigResponse.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lim/threads/business/rest/models/ConfigResponse;", "", "settings", "Lim/threads/business/rest/models/SettingsResponse;", "schedule", "Lim/threads/business/transport/models/ContentScheduleInfoContent;", "attachmentSettings", "Lim/threads/business/transport/models/ContentAttachmentSettings;", "(Lim/threads/business/rest/models/SettingsResponse;Lim/threads/business/transport/models/ContentScheduleInfoContent;Lim/threads/business/transport/models/ContentAttachmentSettings;)V", "getAttachmentSettings", "()Lim/threads/business/transport/models/ContentAttachmentSettings;", "getSchedule", "()Lim/threads/business/transport/models/ContentScheduleInfoContent;", "getSettings", "()Lim/threads/business/rest/models/SettingsResponse;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConfigResponse {
    private final ContentAttachmentSettings attachmentSettings;
    private final ContentScheduleInfoContent schedule;
    private final SettingsResponse settings;

    public ConfigResponse() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ConfigResponse copy$default(ConfigResponse configResponse, SettingsResponse settingsResponse, ContentScheduleInfoContent contentScheduleInfoContent, ContentAttachmentSettings contentAttachmentSettings, int i, Object obj) {
        if ((i & 1) != 0) {
            settingsResponse = configResponse.settings;
        }
        if ((i & 2) != 0) {
            contentScheduleInfoContent = configResponse.schedule;
        }
        if ((i & 4) != 0) {
            contentAttachmentSettings = configResponse.attachmentSettings;
        }
        return configResponse.copy(settingsResponse, contentScheduleInfoContent, contentAttachmentSettings);
    }

    public final SettingsResponse component1() {
        return this.settings;
    }

    public final ContentScheduleInfoContent component2() {
        return this.schedule;
    }

    public final ContentAttachmentSettings component3() {
        return this.attachmentSettings;
    }

    public final ConfigResponse copy(SettingsResponse settingsResponse, ContentScheduleInfoContent contentScheduleInfoContent, ContentAttachmentSettings contentAttachmentSettings) {
        return new ConfigResponse(settingsResponse, contentScheduleInfoContent, contentAttachmentSettings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigResponse)) {
            return false;
        }
        ConfigResponse configResponse = (ConfigResponse) obj;
        if (z65.c(this.settings, configResponse.settings) && z65.c(this.schedule, configResponse.schedule) && z65.c(this.attachmentSettings, configResponse.attachmentSettings)) {
            return true;
        }
        return false;
    }

    public final ContentAttachmentSettings getAttachmentSettings() {
        return this.attachmentSettings;
    }

    public final ContentScheduleInfoContent getSchedule() {
        return this.schedule;
    }

    public final SettingsResponse getSettings() {
        return this.settings;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        SettingsResponse settingsResponse = this.settings;
        int i = 0;
        if (settingsResponse == null) {
            hashCode = 0;
        } else {
            hashCode = settingsResponse.hashCode();
        }
        int i2 = hashCode * 31;
        ContentScheduleInfoContent contentScheduleInfoContent = this.schedule;
        if (contentScheduleInfoContent == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = contentScheduleInfoContent.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        ContentAttachmentSettings contentAttachmentSettings = this.attachmentSettings;
        if (contentAttachmentSettings != null) {
            i = contentAttachmentSettings.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        SettingsResponse settingsResponse = this.settings;
        ContentScheduleInfoContent contentScheduleInfoContent = this.schedule;
        ContentAttachmentSettings contentAttachmentSettings = this.attachmentSettings;
        return "ConfigResponse(settings=" + settingsResponse + ", schedule=" + contentScheduleInfoContent + ", attachmentSettings=" + contentAttachmentSettings + ")";
    }

    public ConfigResponse(SettingsResponse settingsResponse, ContentScheduleInfoContent contentScheduleInfoContent, ContentAttachmentSettings contentAttachmentSettings) {
        this.settings = settingsResponse;
        this.schedule = contentScheduleInfoContent;
        this.attachmentSettings = contentAttachmentSettings;
    }

    public /* synthetic */ ConfigResponse(SettingsResponse settingsResponse, ContentScheduleInfoContent contentScheduleInfoContent, ContentAttachmentSettings contentAttachmentSettings, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : settingsResponse, (i & 2) != 0 ? null : contentScheduleInfoContent, (i & 4) != 0 ? null : contentAttachmentSettings);
    }
}
