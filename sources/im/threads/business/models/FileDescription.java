package im.threads.business.models;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.push.constant.RemoteMessageConst;
import im.threads.business.models.enums.AttachmentStateEnum;
import im.threads.business.models.enums.ErrorStateEnum;
import im.threads.business.utils.FileUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FileDescription.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 e2\u00020\u0001:\u0001eB+\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020#¢\u0006\u0004\bc\u0010dJ\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000J\u000f\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0000R$\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R%\u00100\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010.0.0-8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R$\u00104\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0017\u001a\u0004\b5\u0010\u0019\"\u0004\b6\u0010\u001bR$\u00107\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010\u0017\u001a\u0004\b8\u0010\u0019\"\u0004\b9\u0010\u001bR$\u0010:\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010\u0017\u001a\u0004\b;\u0010\u0019\"\u0004\b<\u0010\u001bR$\u0010=\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010\u0017\u001a\u0004\b>\u0010\u0019\"\u0004\b?\u0010\u001bR\"\u0010@\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010F\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bF\u0010\u0005\"\u0004\bH\u0010IR\"\u0010K\u001a\u00020J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010R\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010X\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010\u0017\u001a\u0004\bY\u0010\u0019\"\u0004\bZ\u0010\u001bR\"\u0010[\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\u0017\u001a\u0004\b\\\u0010\u0019\"\u0004\b]\u0010\u001bR$\u0010^\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010\u0017\u001a\u0004\b_\u0010\u0019\"\u0004\b`\u0010\u001bR\u0018\u0010a\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010b¨\u0006f"}, d2 = {"Lim/threads/business/models/FileDescription;", "Landroid/os/Parcelable;", "getPreviewFileDescription", "", "isFromAssets$threads_release", "()Z", "isFromAssets", "", "other", "equals", "", "hashCode", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "", "toString", "fileDescription", "hasSameContent", RemoteMessageConst.FROM, "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "Landroid/net/Uri;", "fileUri", "Landroid/net/Uri;", "getFileUri", "()Landroid/net/Uri;", "setFileUri", "(Landroid/net/Uri;)V", "", "size", "J", "getSize", "()J", "setSize", "(J)V", "timeStamp", "getTimeStamp", "setTimeStamp", "Lks8;", "Lim/threads/business/models/FileDescriptionUri;", "kotlin.jvm.PlatformType", "onCompleteSubject", "Lks8;", "getOnCompleteSubject", "()Lks8;", "downloadPath", "getDownloadPath", "setDownloadPath", "originalPath", "getOriginalPath", "setOriginalPath", "incomingName", "getIncomingName", "setIncomingName", "mimeType", "getMimeType", "setMimeType", "downloadProgress", "I", "getDownloadProgress", "()I", "setDownloadProgress", "(I)V", "isDownloadError", "Z", "setDownloadError", "(Z)V", "Lim/threads/business/models/enums/AttachmentStateEnum;", "state", "Lim/threads/business/models/enums/AttachmentStateEnum;", "getState", "()Lim/threads/business/models/enums/AttachmentStateEnum;", "setState", "(Lim/threads/business/models/enums/AttachmentStateEnum;)V", "Lim/threads/business/models/enums/ErrorStateEnum;", "errorCode", "Lim/threads/business/models/enums/ErrorStateEnum;", "getErrorCode", "()Lim/threads/business/models/enums/ErrorStateEnum;", "setErrorCode", "(Lim/threads/business/models/enums/ErrorStateEnum;)V", "errorMessage", "getErrorMessage", "setErrorMessage", "voiceFormattedDuration", "getVoiceFormattedDuration", "setVoiceFormattedDuration", "offerLink", "getOfferLink", "setOfferLink", "smallFileDescription", "Lim/threads/business/models/FileDescription;", "<init>", "(Ljava/lang/String;Landroid/net/Uri;JJ)V", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class FileDescription implements Parcelable {
    private String downloadPath;
    private int downloadProgress;
    private ErrorStateEnum errorCode;
    private String errorMessage;
    private Uri fileUri;
    private String from;
    private String incomingName;
    private boolean isDownloadError;
    private String mimeType;
    private String offerLink;
    private final ks8<FileDescriptionUri> onCompleteSubject;
    private String originalPath;
    private long size;
    private FileDescription smallFileDescription;
    private AttachmentStateEnum state;
    private long timeStamp;
    private String voiceFormattedDuration;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<FileDescription> CREATOR = new Parcelable.Creator<FileDescription>() { // from class: im.threads.business.models.FileDescription$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FileDescription createFromParcel(Parcel parcel) {
            z65.h(parcel, KustoStorage.KustoTable.COLUMN_SOURCE);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            int readInt = parcel.readInt();
            FileDescription fileDescription = new FileDescription(parcel.readString(), (Uri) parcel.readParcelable(Uri.class.getClassLoader()), readLong, readLong2);
            AttachmentStateEnum.Companion companion = AttachmentStateEnum.Companion;
            z65.e(readString);
            fileDescription.setState(companion.fromString(readString));
            ErrorStateEnum.Companion companion2 = ErrorStateEnum.Companion;
            z65.e(readString2);
            fileDescription.setErrorCode(companion2.errorStateEnumFromString(readString2));
            fileDescription.setErrorMessage(readString3);
            fileDescription.setIncomingName(readString5);
            fileDescription.setMimeType(readString7);
            fileDescription.setDownloadPath(readString4);
            fileDescription.setOriginalPath(readString6);
            fileDescription.setDownloadProgress(readInt);
            return fileDescription;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FileDescription[] newArray(int i) {
            return new FileDescription[i];
        }
    };

    /* compiled from: FileDescription.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lim/threads/business/models/FileDescription$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lim/threads/business/models/FileDescription;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FileDescription(String str, Uri uri, long j, long j2) {
        this.from = str;
        this.fileUri = uri;
        this.size = j;
        this.timeStamp = j2;
        ks8<FileDescriptionUri> z = ks8.z();
        z65.g(z, "create<FileDescriptionUri>()");
        this.onCompleteSubject = z;
        this.state = AttachmentStateEnum.ANY;
        this.errorCode = ErrorStateEnum.ANY;
        this.errorMessage = "";
        this.voiceFormattedDuration = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileDescription)) {
            return false;
        }
        FileDescription fileDescription = (FileDescription) obj;
        if (this.size != fileDescription.size || this.timeStamp != fileDescription.timeStamp || !p57.a(this.mimeType, fileDescription.mimeType)) {
            return false;
        }
        return p57.a(this.from, fileDescription.from);
    }

    public final String getDownloadPath() {
        return this.downloadPath;
    }

    public final int getDownloadProgress() {
        return this.downloadProgress;
    }

    public final ErrorStateEnum getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final Uri getFileUri() {
        return this.fileUri;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getIncomingName() {
        return this.incomingName;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getOfferLink() {
        return this.offerLink;
    }

    public final ks8<FileDescriptionUri> getOnCompleteSubject() {
        return this.onCompleteSubject;
    }

    public final String getOriginalPath() {
        return this.originalPath;
    }

    public final FileDescription getPreviewFileDescription() {
        if (isFromAssets$threads_release()) {
            return this;
        }
        if (this.smallFileDescription == null && FileUtils.isImage(this)) {
            FileDescription fileDescription = new FileDescription(this.from, null, this.size, this.timeStamp);
            this.smallFileDescription = fileDescription;
            String str = this.downloadPath;
            fileDescription.downloadPath = str + "?size=small";
            FileDescription fileDescription2 = this.smallFileDescription;
            if (fileDescription2 != null) {
                String str2 = this.originalPath;
                fileDescription2.originalPath = str2 + "?size=small";
            }
            FileDescription fileDescription3 = this.smallFileDescription;
            if (fileDescription3 != null) {
                fileDescription3.incomingName = FileUtils.INSTANCE.generatePreviewFileName$threads_release(this.incomingName);
            }
            FileDescription fileDescription4 = this.smallFileDescription;
            if (fileDescription4 != null) {
                fileDescription4.state = this.state;
            }
        }
        return this.smallFileDescription;
    }

    public final long getSize() {
        return this.size;
    }

    public final AttachmentStateEnum getState() {
        return this.state;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final String getVoiceFormattedDuration() {
        return this.voiceFormattedDuration;
    }

    public final boolean hasSameContent(FileDescription fileDescription) {
        if (fileDescription == null || !p57.a(this.from, fileDescription.from) || !p57.a(this.fileUri, fileDescription.fileUri) || !p57.a(Long.valueOf(this.timeStamp), Long.valueOf(fileDescription.timeStamp)) || !p57.a(this.downloadPath, fileDescription.downloadPath) || !p57.a(Long.valueOf(this.size), Long.valueOf(fileDescription.size)) || !p57.a(this.incomingName, fileDescription.incomingName) || !p57.a(this.mimeType, fileDescription.mimeType) || !p57.a(Integer.valueOf(this.downloadProgress), Integer.valueOf(fileDescription.downloadProgress))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return p57.b(Long.valueOf(this.size), Long.valueOf(this.timeStamp), this.mimeType, this.from);
    }

    public final boolean isDownloadError() {
        return this.isDownloadError;
    }

    public final boolean isFromAssets$threads_release() {
        boolean J;
        boolean O;
        String str = this.downloadPath;
        if (str != null) {
            J = l0b.J(str, "file:", false, 2, null);
            if (J) {
                O = m0b.O(str, "android_asset", false, 2, null);
                if (O) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void setDownloadError(boolean z) {
        this.isDownloadError = z;
    }

    public final void setDownloadPath(String str) {
        this.downloadPath = str;
    }

    public final void setDownloadProgress(int i) {
        this.downloadProgress = i;
    }

    public final void setErrorCode(ErrorStateEnum errorStateEnum) {
        z65.h(errorStateEnum, "<set-?>");
        this.errorCode = errorStateEnum;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setFileUri(Uri uri) {
        this.fileUri = uri;
    }

    public final void setFrom(String str) {
        this.from = str;
    }

    public final void setIncomingName(String str) {
        this.incomingName = str;
    }

    public final void setMimeType(String str) {
        this.mimeType = str;
    }

    public final void setOfferLink(String str) {
        this.offerLink = str;
    }

    public final void setOriginalPath(String str) {
        this.originalPath = str;
    }

    public final void setSize(long j) {
        this.size = j;
    }

    public final void setState(AttachmentStateEnum attachmentStateEnum) {
        z65.h(attachmentStateEnum, "<set-?>");
        this.state = attachmentStateEnum;
    }

    public final void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public final void setVoiceFormattedDuration(String str) {
        z65.h(str, "<set-?>");
        this.voiceFormattedDuration = str;
    }

    public String toString() {
        String str = this.from;
        Uri uri = this.fileUri;
        String str2 = this.downloadPath;
        String str3 = this.incomingName;
        long j = this.size;
        long j2 = this.timeStamp;
        int i = this.downloadProgress;
        String state = this.state.getState();
        String state2 = this.errorCode.getState();
        String str4 = this.errorMessage;
        return "FileDescription{from='" + str + "', fileUri='" + uri + "', downloadPath='" + str2 + "', incomingName='" + str3 + "', size=" + j + ", timeStamp=" + j2 + ", downloadProgress=" + i + ", state=" + state + ", errorCode=" + state2 + ", errorMessage=" + str4 + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        z65.h(parcel, "dest");
        parcel.writeString(this.state.getState());
        parcel.writeString(this.errorCode.getState());
        parcel.writeString(this.errorMessage);
        parcel.writeString(this.from);
        parcel.writeParcelable(this.fileUri, 0);
        parcel.writeString(this.downloadPath);
        parcel.writeString(this.incomingName);
        parcel.writeString(this.originalPath);
        parcel.writeString(this.mimeType);
        parcel.writeLong(this.size);
        parcel.writeLong(this.timeStamp);
        parcel.writeInt(this.downloadProgress);
    }
}
