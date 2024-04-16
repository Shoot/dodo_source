package im.threads.business.formatters;

import android.os.Parcel;
import android.os.Parcelable;
import im.threads.business.formatters.MessageFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MessageFormatter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lim/threads/business/formatters/MessageFormatter;", "", "()V", "MessageContent", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MessageFormatter {
    public static final MessageFormatter INSTANCE = new MessageFormatter();

    /* compiled from: MessageFormatter.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 *2\u00020\u0001:\u0001*B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010 \u001a\u00020\u0016H\u0016J\u0013\u0010!\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020\u0016H\u0016J\b\u0010%\u001a\u00020\u0006H\u0016J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0016H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\bR\u0011\u0010\u001c\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\b¨\u0006+"}, d2 = {"Lim/threads/business/formatters/MessageFormatter$MessageContent;", "Landroid/os/Parcelable;", "in", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "avatarPath", "", "getAvatarPath", "()Ljava/lang/String;", "consultName", "getConsultName", "contentText", "getContentText", "hasAvatar", "", "getHasAvatar", "()Z", "hasImage", "getHasImage", "hasPlainFiles", "getHasPlainFiles", "imagesCount", "", "getImagesCount", "()I", "isNeedAnswer", "lastImagePath", "getLastImagePath", "phrasesCount", "getPhrasesCount", "titleText", "getTitleText", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "flags", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class MessageContent implements Parcelable {
        private final String avatarPath;
        private final String consultName;
        private final String contentText;
        private final boolean hasAvatar;
        private final boolean hasImage;
        private final boolean hasPlainFiles;
        private final int imagesCount;
        private final boolean isNeedAnswer;
        private final String lastImagePath;
        private final int phrasesCount;
        private final String titleText;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<MessageContent> CREATOR = new Parcelable.Creator<MessageContent>() { // from class: im.threads.business.formatters.MessageFormatter$MessageContent$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public MessageFormatter.MessageContent createFromParcel(Parcel parcel) {
                z65.h(parcel, "in");
                return new MessageFormatter.MessageContent(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public MessageFormatter.MessageContent[] newArray(int i) {
                return new MessageFormatter.MessageContent[i];
            }
        };

        /* compiled from: MessageFormatter.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lim/threads/business/formatters/MessageFormatter$MessageContent$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lim/threads/business/formatters/MessageFormatter$MessageContent;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public MessageContent(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            z65.h(parcel, "in");
            this.titleText = parcel.readString();
            String readString = parcel.readString();
            z65.e(readString);
            this.contentText = readString;
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.hasAvatar = z;
            if (parcel.readByte() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.hasImage = z2;
            if (parcel.readByte() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.hasPlainFiles = z3;
            this.imagesCount = parcel.readInt();
            this.phrasesCount = parcel.readInt();
            this.avatarPath = parcel.readString();
            this.lastImagePath = parcel.readString();
            this.consultName = parcel.readString();
            this.isNeedAnswer = parcel.readByte() != 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !z65.c(MessageContent.class, obj.getClass())) {
                return false;
            }
            MessageContent messageContent = (MessageContent) obj;
            if (this.hasAvatar == messageContent.hasAvatar && this.hasImage == messageContent.hasImage && this.imagesCount == messageContent.imagesCount && this.phrasesCount == messageContent.phrasesCount && this.hasPlainFiles == messageContent.hasPlainFiles && this.isNeedAnswer == messageContent.isNeedAnswer && p57.a(this.titleText, messageContent.titleText) && p57.a(this.contentText, messageContent.contentText) && p57.a(this.avatarPath, messageContent.avatarPath) && p57.a(this.lastImagePath, messageContent.lastImagePath) && p57.a(this.consultName, messageContent.consultName)) {
                return true;
            }
            return false;
        }

        public final String getAvatarPath() {
            return this.avatarPath;
        }

        public final String getConsultName() {
            return this.consultName;
        }

        public final String getContentText() {
            return this.contentText;
        }

        public final boolean getHasAvatar() {
            return this.hasAvatar;
        }

        public final boolean getHasImage() {
            return this.hasImage;
        }

        public final boolean getHasPlainFiles() {
            return this.hasPlainFiles;
        }

        public final int getImagesCount() {
            return this.imagesCount;
        }

        public final String getLastImagePath() {
            return this.lastImagePath;
        }

        public final int getPhrasesCount() {
            return this.phrasesCount;
        }

        public final String getTitleText() {
            return this.titleText;
        }

        public int hashCode() {
            return p57.b(this.titleText, this.contentText, Boolean.valueOf(this.hasAvatar), Boolean.valueOf(this.hasImage), Integer.valueOf(this.imagesCount), Integer.valueOf(this.phrasesCount), Boolean.valueOf(this.hasPlainFiles), this.avatarPath, this.lastImagePath, this.consultName, Boolean.valueOf(this.isNeedAnswer));
        }

        public final boolean isNeedAnswer() {
            return this.isNeedAnswer;
        }

        public String toString() {
            String str = this.titleText;
            String str2 = this.contentText;
            boolean z = this.hasAvatar;
            boolean z2 = this.hasImage;
            boolean z3 = this.hasPlainFiles;
            int i = this.imagesCount;
            int i2 = this.phrasesCount;
            String str3 = this.avatarPath;
            String str4 = this.lastImagePath;
            String str5 = this.consultName;
            boolean z4 = this.isNeedAnswer;
            return "MessageContent{titleText='" + str + "', contentText='" + str2 + "', hasAvatar=" + z + ", hasImage=" + z2 + ", hasPlainFiles=" + z3 + ", imagesCount=" + i + ", phrasesCount=" + i2 + ", avatarPath='" + str3 + "', lastImagePath='" + str4 + "', consultName='" + str5 + "', isNeedAnswer=" + z4 + "}";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            z65.h(parcel, "dest");
            parcel.writeString(this.titleText);
            parcel.writeString(this.contentText);
            parcel.writeByte(this.hasAvatar ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.hasImage ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.hasPlainFiles ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.imagesCount);
            parcel.writeInt(this.phrasesCount);
            parcel.writeString(this.avatarPath);
            parcel.writeString(this.lastImagePath);
            parcel.writeString(this.consultName);
            parcel.writeByte(this.isNeedAnswer ? (byte) 1 : (byte) 0);
        }
    }

    private MessageFormatter() {
    }
}
