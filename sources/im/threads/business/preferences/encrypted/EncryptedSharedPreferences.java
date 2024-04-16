package im.threads.business.preferences.encrypted;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.NonNull;
import defpackage.ch;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes3.dex */
public final class EncryptedSharedPreferences implements SharedPreferences {
    private static final String KEY_KEYSET_ALIAS = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
    private static final String NULL_VALUE = "__NULL__";
    private static final String VALUE_KEYSET_ALIAS = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
    final String mFileName;
    final m13 mKeyDeterministicAead;
    final CopyOnWriteArrayList<SharedPreferences.OnSharedPreferenceChangeListener> mListeners = new CopyOnWriteArrayList<>();
    final String mMasterKeyAlias;
    final SharedPreferences mSharedPreferences;
    final l9 mValueAead;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: im.threads.business.preferences.encrypted.EncryptedSharedPreferences$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$im$threads$business$preferences$encrypted$EncryptedSharedPreferences$EncryptedType;

        static {
            int[] iArr = new int[EncryptedType.values().length];
            $SwitchMap$im$threads$business$preferences$encrypted$EncryptedSharedPreferences$EncryptedType = iArr;
            try {
                iArr[EncryptedType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$im$threads$business$preferences$encrypted$EncryptedSharedPreferences$EncryptedType[EncryptedType.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$im$threads$business$preferences$encrypted$EncryptedSharedPreferences$EncryptedType[EncryptedType.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$im$threads$business$preferences$encrypted$EncryptedSharedPreferences$EncryptedType[EncryptedType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$im$threads$business$preferences$encrypted$EncryptedSharedPreferences$EncryptedType[EncryptedType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$im$threads$business$preferences$encrypted$EncryptedSharedPreferences$EncryptedType[EncryptedType.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes3.dex */
    private static final class Editor implements SharedPreferences.Editor {
        private final SharedPreferences.Editor mEditor;
        private final EncryptedSharedPreferences mEncryptedSharedPreferences;
        private final AtomicBoolean mClearRequested = new AtomicBoolean(false);
        private final List<String> mKeysChanged = new CopyOnWriteArrayList();

        Editor(EncryptedSharedPreferences encryptedSharedPreferences, SharedPreferences.Editor editor) {
            this.mEncryptedSharedPreferences = encryptedSharedPreferences;
            this.mEditor = editor;
        }

        private void clearKeysIfNeeded() {
            if (this.mClearRequested.getAndSet(false)) {
                for (String str : this.mEncryptedSharedPreferences.getAll().keySet()) {
                    if (!this.mKeysChanged.contains(str) && !this.mEncryptedSharedPreferences.isReservedKey(str)) {
                        this.mEditor.remove(this.mEncryptedSharedPreferences.encryptKey(str));
                    }
                }
            }
        }

        private void notifyListeners() {
            Iterator<SharedPreferences.OnSharedPreferenceChangeListener> it = this.mEncryptedSharedPreferences.mListeners.iterator();
            while (it.hasNext()) {
                SharedPreferences.OnSharedPreferenceChangeListener next = it.next();
                for (String str : this.mKeysChanged) {
                    next.onSharedPreferenceChanged(this.mEncryptedSharedPreferences, str);
                }
            }
        }

        private void putEncryptedObject(String str, byte[] bArr) {
            if (!this.mEncryptedSharedPreferences.isReservedKey(str)) {
                this.mKeysChanged.add(str);
                if (str == null) {
                    str = EncryptedSharedPreferences.NULL_VALUE;
                }
                try {
                    Pair<String, String> encryptKeyValuePair = this.mEncryptedSharedPreferences.encryptKeyValuePair(str, bArr);
                    this.mEditor.putString((String) encryptKeyValuePair.first, (String) encryptKeyValuePair.second);
                    return;
                } catch (GeneralSecurityException e) {
                    throw new SecurityException("Could not encrypt data: " + e.getMessage(), e);
                }
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            clearKeysIfNeeded();
            this.mEditor.apply();
            notifyListeners();
            this.mKeysChanged.clear();
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public SharedPreferences.Editor clear() {
            this.mClearRequested.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            clearKeysIfNeeded();
            try {
                return this.mEditor.commit();
            } finally {
                notifyListeners();
                this.mKeysChanged.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(EncryptedType.BOOLEAN.getId());
            allocate.put(z ? (byte) 1 : (byte) 0);
            putEncryptedObject(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public SharedPreferences.Editor putFloat(String str, float f) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(EncryptedType.FLOAT.getId());
            allocate.putFloat(f);
            putEncryptedObject(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public SharedPreferences.Editor putInt(String str, int i) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(EncryptedType.INT.getId());
            allocate.putInt(i);
            putEncryptedObject(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public SharedPreferences.Editor putLong(String str, long j) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(EncryptedType.LONG.getId());
            allocate.putLong(j);
            putEncryptedObject(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = EncryptedSharedPreferences.NULL_VALUE;
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(EncryptedType.STRING.getId());
            allocate.putInt(length);
            allocate.put(bytes);
            putEncryptedObject(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            if (set == null) {
                set = new qr<>();
                set.add(EncryptedSharedPreferences.NULL_VALUE);
            }
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            for (String str2 : set) {
                byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(EncryptedType.STRING_SET.getId());
            for (byte[] bArr : arrayList) {
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            putEncryptedObject(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public SharedPreferences.Editor remove(String str) {
            if (!this.mEncryptedSharedPreferences.isReservedKey(str)) {
                this.mEditor.remove(this.mEncryptedSharedPreferences.encryptKey(str));
                this.mKeysChanged.add(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public enum EncryptedType {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);
        
        private final int mId;

        EncryptedType(int i) {
            this.mId = i;
        }

        public static EncryptedType fromId(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    return null;
                                }
                                return BOOLEAN;
                            }
                            return FLOAT;
                        }
                        return LONG;
                    }
                    return INT;
                }
                return STRING_SET;
            }
            return STRING;
        }

        public int getId() {
            return this.mId;
        }
    }

    /* loaded from: classes3.dex */
    public enum PrefKeyEncryptionScheme {
        AES256_SIV("AES256_SIV");
        
        private final String mDeterministicAeadKeyTemplateName;

        PrefKeyEncryptionScheme(String str) {
            this.mDeterministicAeadKeyTemplateName = str;
        }

        uf5 getKeyTemplate() throws GeneralSecurityException {
            return wf5.a(this.mDeterministicAeadKeyTemplateName);
        }
    }

    /* loaded from: classes3.dex */
    public enum PrefValueEncryptionScheme {
        AES256_GCM("AES256_GCM");
        
        private final String mAeadKeyTemplateName;

        PrefValueEncryptionScheme(String str) {
            this.mAeadKeyTemplateName = str;
        }

        uf5 getKeyTemplate() throws GeneralSecurityException {
            return wf5.a(this.mAeadKeyTemplateName);
        }
    }

    EncryptedSharedPreferences(@NonNull String str, @NonNull String str2, @NonNull SharedPreferences sharedPreferences, @NonNull l9 l9Var, @NonNull m13 m13Var) {
        this.mFileName = str;
        this.mSharedPreferences = sharedPreferences;
        this.mMasterKeyAlias = str2;
        this.mValueAead = l9Var;
        this.mKeyDeterministicAead = m13Var;
    }

    @NonNull
    public static SharedPreferences create(@NonNull Context context, @NonNull String str, @NonNull MasterKey masterKey, @NonNull PrefKeyEncryptionScheme prefKeyEncryptionScheme, @NonNull PrefValueEncryptionScheme prefValueEncryptionScheme) throws GeneralSecurityException, IOException {
        return create(str, masterKey.getKeyAlias(), context, prefKeyEncryptionScheme, prefValueEncryptionScheme);
    }

    private Object getDecryptedObject(String str) throws SecurityException {
        if (!isReservedKey(str)) {
            if (str == null) {
                str = NULL_VALUE;
            }
            try {
                String encryptKey = encryptKey(str);
                String string = this.mSharedPreferences.getString(encryptKey, null);
                if (string == null) {
                    return null;
                }
                boolean z = false;
                byte[] a = r60.a(string, 0);
                l9 l9Var = this.mValueAead;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer wrap = ByteBuffer.wrap(l9Var.a(a, encryptKey.getBytes(charset)));
                wrap.position(0);
                int i = wrap.getInt();
                EncryptedType fromId = EncryptedType.fromId(i);
                if (fromId != null) {
                    switch (AnonymousClass1.$SwitchMap$im$threads$business$preferences$encrypted$EncryptedSharedPreferences$EncryptedType[fromId.ordinal()]) {
                        case 1:
                            int i2 = wrap.getInt();
                            ByteBuffer slice = wrap.slice();
                            wrap.limit(i2);
                            String charBuffer = charset.decode(slice).toString();
                            if (charBuffer.equals(NULL_VALUE)) {
                                return null;
                            }
                            return charBuffer;
                        case 2:
                            return Integer.valueOf(wrap.getInt());
                        case 3:
                            return Long.valueOf(wrap.getLong());
                        case 4:
                            return Float.valueOf(wrap.getFloat());
                        case 5:
                            if (wrap.get() != 0) {
                                z = true;
                            }
                            return Boolean.valueOf(z);
                        case 6:
                            qr qrVar = new qr();
                            while (wrap.hasRemaining()) {
                                int i3 = wrap.getInt();
                                ByteBuffer slice2 = wrap.slice();
                                slice2.limit(i3);
                                wrap.position(wrap.position() + i3);
                                qrVar.add(StandardCharsets.UTF_8.decode(slice2).toString());
                            }
                            if (qrVar.size() == 1 && NULL_VALUE.equals(qrVar.u(0))) {
                                return null;
                            }
                            return qrVar;
                        default:
                            throw new SecurityException("Unhandled type for encrypted pref value: " + fromId);
                    }
                }
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i);
            } catch (GeneralSecurityException e) {
                throw new SecurityException("Could not decrypt value. " + e.getMessage(), e);
            }
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (!isReservedKey(str)) {
            return this.mSharedPreferences.contains(encryptKey(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    String decryptKey(String str) {
        try {
            String str2 = new String(this.mKeyDeterministicAead.b(r60.a(str, 0), this.mFileName.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals(NULL_VALUE)) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not decrypt key. " + e.getMessage(), e);
        }
    }

    @Override // android.content.SharedPreferences
    @NonNull
    public SharedPreferences.Editor edit() {
        return new Editor(this, this.mSharedPreferences.edit());
    }

    String encryptKey(String str) {
        if (str == null) {
            str = NULL_VALUE;
        }
        try {
            return r60.d(this.mKeyDeterministicAead.a(str.getBytes(StandardCharsets.UTF_8), this.mFileName.getBytes()));
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not encrypt key. " + e.getMessage(), e);
        }
    }

    Pair<String, String> encryptKeyValuePair(String str, byte[] bArr) throws GeneralSecurityException {
        String encryptKey = encryptKey(str);
        return new Pair<>(encryptKey, r60.d(this.mValueAead.b(bArr, encryptKey.getBytes(StandardCharsets.UTF_8))));
    }

    @Override // android.content.SharedPreferences
    @NonNull
    public Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.mSharedPreferences.getAll().entrySet()) {
            if (!isReservedKey(entry.getKey())) {
                String decryptKey = decryptKey(entry.getKey());
                hashMap.put(decryptKey, getDecryptedObject(decryptKey));
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        Object decryptedObject = getDecryptedObject(str);
        if (decryptedObject instanceof Boolean) {
            return ((Boolean) decryptedObject).booleanValue();
        }
        return z;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        Object decryptedObject = getDecryptedObject(str);
        if (decryptedObject instanceof Float) {
            return ((Float) decryptedObject).floatValue();
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        Object decryptedObject = getDecryptedObject(str);
        if (decryptedObject instanceof Integer) {
            return ((Integer) decryptedObject).intValue();
        }
        return i;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        Object decryptedObject = getDecryptedObject(str);
        if (decryptedObject instanceof Long) {
            return ((Long) decryptedObject).longValue();
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object decryptedObject = getDecryptedObject(str);
        if (decryptedObject instanceof String) {
            return (String) decryptedObject;
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> qrVar;
        Object decryptedObject = getDecryptedObject(str);
        if (decryptedObject instanceof Set) {
            qrVar = (Set) decryptedObject;
        } else {
            qrVar = new qr<>();
        }
        if (qrVar.size() > 0) {
            return qrVar;
        }
        return set;
    }

    boolean isReservedKey(String str) {
        if (!KEY_KEYSET_ALIAS.equals(str) && !VALUE_KEYSET_ALIAS.equals(str)) {
            return false;
        }
        return true;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(@NonNull SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mListeners.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(@NonNull SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mListeners.remove(onSharedPreferenceChangeListener);
    }

    @NonNull
    @Deprecated
    public static SharedPreferences create(@NonNull String str, @NonNull String str2, @NonNull Context context, @NonNull PrefKeyEncryptionScheme prefKeyEncryptionScheme, @NonNull PrefValueEncryptionScheme prefValueEncryptionScheme) throws GeneralSecurityException, IOException {
        n13.a();
        m9.b();
        Context applicationContext = context.getApplicationContext();
        ch.b j = new ch.b().h(prefKeyEncryptionScheme.getKeyTemplate()).j(applicationContext, KEY_KEYSET_ALIAS, str);
        rg5 c = j.i("android-keystore://" + str2).d().c();
        ch.b j2 = new ch.b().h(prefValueEncryptionScheme.getKeyTemplate()).j(applicationContext, VALUE_KEYSET_ALIAS, str);
        rg5 c2 = j2.i("android-keystore://" + str2).d().c();
        m13 m13Var = (m13) c.h(m13.class);
        return new EncryptedSharedPreferences(str, str2, applicationContext.getSharedPreferences(str, 0), (l9) c2.h(l9.class), m13Var);
    }
}
