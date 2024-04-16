package im.threads.ui.activities;

import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.R;
import im.threads.business.models.MediaPhoto;
import im.threads.business.models.PhotoBucketItem;
import im.threads.business.utils.MediaHelper;
import im.threads.databinding.EccActivityGalleryBinding;
import im.threads.ui.ChatStyle;
import im.threads.ui.activities.GalleryActivity;
import im.threads.ui.adapters.GalleryAdapter;
import im.threads.ui.adapters.PhotoBucketsGalleryAdapter;
import im.threads.ui.config.Config;
import im.threads.ui.utils.BucketsGalleryDecorator;
import im.threads.ui.utils.ColorsHelper;
import im.threads.ui.utils.GalleryDecorator;
import im.threads.ui.utils.ViewExtensionsKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: GalleryActivity.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 E2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002EFB\u0007¢\u0006\u0004\bC\u0010DJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000bH\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0002J\u0012\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u001b\u001a\u00020\u0004H\u0014J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0016\u0010$\u001a\u00020\u00042\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0016J\u0006\u0010%\u001a\u00020\u0004J\u0006\u0010&\u001a\u00020\u0004J\u0006\u0010'\u001a\u00020\u0004R\"\u0010+\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010)0)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010-\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010\u001d0\u001d0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R(\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0/0.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\r0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006G"}, d2 = {"Lim/threads/ui/activities/GalleryActivity;", "Lim/threads/ui/activities/BaseActivity;", "Lim/threads/ui/adapters/PhotoBucketsGalleryAdapter$OnItemClick;", "Lim/threads/ui/adapters/GalleryAdapter$OnGalleryItemClick;", "", "initStatusBar", "initToolbarTextPosition", "setButtonsClickListeners", "initViews", "initData", "showBucketListState", "", "title", "Lim/threads/business/models/PhotoBucketItem;", "item", "showPhotoListState", "showSearchState", "searchString", "search", "clearCheckedStateOfItems", "syncSendButtonState", "subscribeToScreenState", "subscribeToDataIsEmpty", "checkBottomButtons", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onDestroy", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "onBackPressed", "onPhotoBucketClick", "", "Lim/threads/business/models/MediaPhoto;", "chosenItems", "onGalleryItemsChosen", "clearSearch", "showSearch", "send", "Lta0;", "Lim/threads/ui/activities/GalleryActivity$ScreenState;", "kotlin.jvm.PlatformType", "screenState", "Lta0;", "dataIsEmpty", "", "", "photosMap", "Ljava/util/Map;", "bucketItems", "Ljava/util/List;", "Lim/threads/ui/utils/BucketsGalleryDecorator;", "bucketsGalleryDecorator", "Lim/threads/ui/utils/BucketsGalleryDecorator;", "Lim/threads/ui/utils/GalleryDecorator;", "galleryDecorator", "Lim/threads/ui/utils/GalleryDecorator;", "Lqx1;", "coroutineScope", "Lqx1;", "Lwn1;", "compositeDisposable", "Lwn1;", "Lim/threads/databinding/EccActivityGalleryBinding;", "binding", "Lim/threads/databinding/EccActivityGalleryBinding;", "<init>", "()V", "Companion", "ScreenState", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class GalleryActivity extends BaseActivity implements PhotoBucketsGalleryAdapter.OnItemClick, GalleryAdapter.OnGalleryItemClick {
    public static final Companion Companion = new Companion(null);
    private static final String PHOTOS_REQUEST_CODE_TAG = "PHOTOS_REQUEST_CODE_TAG";
    public static final String PHOTOS_TAG = "PHOTOS_TAG";
    private EccActivityGalleryBinding binding;
    private final List<PhotoBucketItem> bucketItems;
    private final BucketsGalleryDecorator bucketsGalleryDecorator;
    private final List<MediaPhoto> chosenItems;
    private final wn1 compositeDisposable;
    private final qx1 coroutineScope;
    private final ta0<Boolean> dataIsEmpty;
    private final GalleryDecorator galleryDecorator;
    private Map<String, List<MediaPhoto>> photosMap;
    private final ta0<ScreenState> screenState;

    /* compiled from: GalleryActivity.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lim/threads/ui/activities/GalleryActivity$Companion;", "", "()V", GalleryActivity.PHOTOS_REQUEST_CODE_TAG, "", GalleryActivity.PHOTOS_TAG, "getStartIntent", "Landroid/content/Intent;", "ctx", "Landroid/content/Context;", "requestCode", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent getStartIntent(Context context, int i) {
            Intent intent = new Intent(context, GalleryActivity.class);
            intent.putExtra(GalleryActivity.PHOTOS_REQUEST_CODE_TAG, i);
            return intent;
        }
    }

    /* compiled from: GalleryActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lim/threads/ui/activities/GalleryActivity$ScreenState;", "", "(Ljava/lang/String;I)V", "BUCKET_LIST", "PHOTO_LIST", "SEARCH", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public enum ScreenState {
        BUCKET_LIST,
        PHOTO_LIST,
        SEARCH
    }

    public GalleryActivity() {
        ta0<ScreenState> z = ta0.z(ScreenState.BUCKET_LIST);
        z65.g(z, "createDefault(ScreenState.BUCKET_LIST)");
        this.screenState = z;
        ta0<Boolean> z2 = ta0.z(Boolean.FALSE);
        z65.g(z2, "createDefault(false)");
        this.dataIsEmpty = z2;
        this.photosMap = new HashMap();
        this.bucketItems = new ArrayList();
        this.chosenItems = new ArrayList();
        this.bucketsGalleryDecorator = new BucketsGalleryDecorator(4);
        this.galleryDecorator = new GalleryDecorator(4);
        this.coroutineScope = rx1.a(v33.b());
        this.compositeDisposable = new wn1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkBottomButtons() {
        EccActivityGalleryBinding eccActivityGalleryBinding = null;
        if (!z65.c(this.dataIsEmpty.A(), Boolean.TRUE) && this.screenState.A() != ScreenState.BUCKET_LIST) {
            EccActivityGalleryBinding eccActivityGalleryBinding2 = this.binding;
            if (eccActivityGalleryBinding2 == null) {
                z65.z("binding");
            } else {
                eccActivityGalleryBinding = eccActivityGalleryBinding2;
            }
            ViewExtensionsKt.visible(eccActivityGalleryBinding.bottomButtons);
            return;
        }
        EccActivityGalleryBinding eccActivityGalleryBinding3 = this.binding;
        if (eccActivityGalleryBinding3 == null) {
            z65.z("binding");
        } else {
            eccActivityGalleryBinding = eccActivityGalleryBinding3;
        }
        ViewExtensionsKt.gone(eccActivityGalleryBinding.bottomButtons);
    }

    private final void clearCheckedStateOfItems() {
        Iterator<T> it = this.photosMap.values().iterator();
        while (it.hasNext()) {
            for (MediaPhoto mediaPhoto : (List) it.next()) {
                mediaPhoto.setChecked(false);
            }
        }
    }

    public static final Intent getStartIntent(Context context, int i) {
        return Companion.getStartIntent(context, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initData() {
        List<MediaPhoto> arrayList;
        Cursor allPhotos = MediaHelper.getAllPhotos(this);
        if (allPhotos != null) {
            try {
                if (allPhotos.getCount() > 0) {
                    int columnIndex = allPhotos.getColumnIndex("_id");
                    int columnIndex2 = allPhotos.getColumnIndex("_display_name");
                    int columnIndex3 = allPhotos.getColumnIndex("bucket_display_name");
                    this.photosMap = new HashMap();
                    allPhotos.moveToFirst();
                    while (!allPhotos.isAfterLast()) {
                        Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, allPhotos.getLong(columnIndex));
                        z65.g(withAppendedId, "withAppendedId(\n        …                        )");
                        String string = allPhotos.getString(columnIndex3);
                        String string2 = allPhotos.getString(columnIndex2);
                        if (string != null && string.length() != 0) {
                            if (this.photosMap.containsKey(string)) {
                                arrayList = this.photosMap.get(string);
                                if (arrayList == null) {
                                    arrayList = new ArrayList<>();
                                }
                            } else {
                                arrayList = new ArrayList<>();
                            }
                            if (string2 != null && string2.length() != 0) {
                                z65.g(string2, "displayName");
                                z65.g(string, "bucketName");
                                arrayList.add(new MediaPhoto(withAppendedId, string2, string));
                            }
                            if (arrayList.size() > 0) {
                                Map<String, List<MediaPhoto>> map = this.photosMap;
                                z65.g(string, "bucketName");
                                map.put(string, arrayList);
                            }
                        }
                        allPhotos.moveToNext();
                    }
                }
            } finally {
            }
        }
        for (Map.Entry<String, List<MediaPhoto>> entry : this.photosMap.entrySet()) {
            String key = entry.getKey();
            List<MediaPhoto> value = entry.getValue();
            if (value.size() > 0) {
                this.bucketItems.add(new PhotoBucketItem(key, String.valueOf(value.size()), value.get(0).getImageUri()));
            }
        }
        Unit unit = Unit.a;
        aa1.a(allPhotos, null);
    }

    private final void initStatusBar() {
        Config.Companion companion = Config.Companion;
        ChatStyle chatStyle = companion.getInstance().getChatStyle();
        int c = iu1.c(this, chatStyle.chatStatusBarColorResId);
        int c2 = iu1.c(this, chatStyle.chatToolbarColorResId);
        super.setStatusBarColor(getResources().getBoolean(companion.getInstance().getChatStyle().windowLightStatusBarResId), c);
        Drawable b = on.b(this, R.drawable.ecc_ic_arrow_back_white_24dp);
        ColorsHelper.setDrawableColor(this, b, chatStyle.chatToolbarTextColorResId);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.r(new ColorDrawable(c2));
            supportActionBar.t(chatStyle.chatToolbarBackIconResId);
            supportActionBar.u(b);
        }
        int c3 = iu1.c(this, chatStyle.chatToolbarTextColorResId);
        int c4 = iu1.c(this, chatStyle.chatToolbarHintTextColor);
        EccActivityGalleryBinding eccActivityGalleryBinding = this.binding;
        EccActivityGalleryBinding eccActivityGalleryBinding2 = null;
        if (eccActivityGalleryBinding == null) {
            z65.z("binding");
            eccActivityGalleryBinding = null;
        }
        eccActivityGalleryBinding.toolbar.getTitle();
        EccActivityGalleryBinding eccActivityGalleryBinding3 = this.binding;
        if (eccActivityGalleryBinding3 == null) {
            z65.z("binding");
            eccActivityGalleryBinding3 = null;
        }
        eccActivityGalleryBinding3.searchEditText.setTextColor(c3);
        EccActivityGalleryBinding eccActivityGalleryBinding4 = this.binding;
        if (eccActivityGalleryBinding4 == null) {
            z65.z("binding");
            eccActivityGalleryBinding4 = null;
        }
        eccActivityGalleryBinding4.searchEditText.setHintTextColor(c4);
        EccActivityGalleryBinding eccActivityGalleryBinding5 = this.binding;
        if (eccActivityGalleryBinding5 == null) {
            z65.z("binding");
            eccActivityGalleryBinding5 = null;
        }
        eccActivityGalleryBinding5.clearSearchButton.setImageResource(R.drawable.ecc_ic_clear_gray_30dp);
        EccActivityGalleryBinding eccActivityGalleryBinding6 = this.binding;
        if (eccActivityGalleryBinding6 == null) {
            z65.z("binding");
            eccActivityGalleryBinding6 = null;
        }
        eccActivityGalleryBinding6.title.setTextColor(c3);
        EccActivityGalleryBinding eccActivityGalleryBinding7 = this.binding;
        if (eccActivityGalleryBinding7 == null) {
            z65.z("binding");
            eccActivityGalleryBinding7 = null;
        }
        ColorsHelper.setTint(this, eccActivityGalleryBinding7.clearSearchButton, chatStyle.chatToolbarTextColorResId);
        EccActivityGalleryBinding eccActivityGalleryBinding8 = this.binding;
        if (eccActivityGalleryBinding8 == null) {
            z65.z("binding");
        } else {
            eccActivityGalleryBinding2 = eccActivityGalleryBinding8;
        }
        ColorsHelper.setTint(this, eccActivityGalleryBinding2.backButton, chatStyle.chatToolbarTextColorResId);
        initToolbarTextPosition();
    }

    private final void initToolbarTextPosition() {
        int i;
        if (Config.Companion.getInstance().getChatStyle().isToolbarTextCentered) {
            i = 17;
        } else {
            i = 16;
        }
        EccActivityGalleryBinding eccActivityGalleryBinding = this.binding;
        if (eccActivityGalleryBinding == null) {
            z65.z("binding");
            eccActivityGalleryBinding = null;
        }
        eccActivityGalleryBinding.title.setGravity(i);
    }

    private final void initViews() {
        EccActivityGalleryBinding eccActivityGalleryBinding = this.binding;
        EccActivityGalleryBinding eccActivityGalleryBinding2 = null;
        if (eccActivityGalleryBinding == null) {
            z65.z("binding");
            eccActivityGalleryBinding = null;
        }
        setSupportActionBar(eccActivityGalleryBinding.toolbar);
        EccActivityGalleryBinding eccActivityGalleryBinding3 = this.binding;
        if (eccActivityGalleryBinding3 == null) {
            z65.z("binding");
            eccActivityGalleryBinding3 = null;
        }
        eccActivityGalleryBinding3.searchEditText.addTextChangedListener(new TextWatcher() { // from class: im.threads.ui.activities.GalleryActivity$initViews$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                z65.h(editable, Image.TYPE_SMALL);
                if (editable.length() > 0) {
                    GalleryActivity.this.search(editable.toString());
                } else {
                    GalleryActivity.this.search("");
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                z65.h(charSequence, Image.TYPE_SMALL);
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                z65.h(charSequence, Image.TYPE_SMALL);
            }
        });
        EccActivityGalleryBinding eccActivityGalleryBinding4 = this.binding;
        if (eccActivityGalleryBinding4 == null) {
            z65.z("binding");
        } else {
            eccActivityGalleryBinding2 = eccActivityGalleryBinding4;
        }
        eccActivityGalleryBinding2.searchEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: bc4
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean initViews$lambda$8;
                initViews$lambda$8 = GalleryActivity.initViews$lambda$8(GalleryActivity.this, textView, i, keyEvent);
                return initViews$lambda$8;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initViews$lambda$8(GalleryActivity galleryActivity, TextView textView, int i, KeyEvent keyEvent) {
        z65.h(galleryActivity, "this$0");
        if (i == 3) {
            galleryActivity.search(textView.getText().toString());
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void search(String str) {
        EccActivityGalleryBinding eccActivityGalleryBinding;
        boolean O;
        boolean O2;
        clearCheckedStateOfItems();
        this.chosenItems.clear();
        syncSendButtonState();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.photosMap.values().iterator();
        while (true) {
            eccActivityGalleryBinding = null;
            if (!it.hasNext()) {
                break;
            }
            for (MediaPhoto mediaPhoto : (List) it.next()) {
                String uri = mediaPhoto.getImageUri().toString();
                z65.g(uri, "photo.imageUri.toString()");
                Locale locale = Locale.getDefault();
                z65.g(locale, "getDefault()");
                String lowerCase = uri.toLowerCase(locale);
                z65.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                Locale locale2 = Locale.getDefault();
                z65.g(locale2, "getDefault()");
                String lowerCase2 = str.toLowerCase(locale2);
                z65.g(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                O = m0b.O(lowerCase, lowerCase2, false, 2, null);
                if (!O) {
                    String displayName = mediaPhoto.getDisplayName();
                    Locale locale3 = Locale.getDefault();
                    z65.g(locale3, "getDefault()");
                    String lowerCase3 = str.toLowerCase(locale3);
                    z65.g(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                    O2 = m0b.O(displayName, lowerCase3, false, 2, null);
                    if (O2) {
                    }
                }
                arrayList.add(mediaPhoto);
            }
        }
        EccActivityGalleryBinding eccActivityGalleryBinding2 = this.binding;
        if (eccActivityGalleryBinding2 == null) {
            z65.z("binding");
        } else {
            eccActivityGalleryBinding = eccActivityGalleryBinding2;
        }
        eccActivityGalleryBinding.recycler.setAdapter(new GalleryAdapter(arrayList, this));
        this.dataIsEmpty.d(Boolean.valueOf(arrayList.isEmpty()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setButtonsClickListeners() {
        EccActivityGalleryBinding eccActivityGalleryBinding = this.binding;
        if (eccActivityGalleryBinding == null) {
            z65.z("binding");
            eccActivityGalleryBinding = null;
        }
        eccActivityGalleryBinding.backButton.setOnClickListener(new View.OnClickListener() { // from class: cc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GalleryActivity.setButtonsClickListeners$lambda$6$lambda$1(GalleryActivity.this, view);
            }
        });
        eccActivityGalleryBinding.clearSearchButton.setOnClickListener(new View.OnClickListener() { // from class: dc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GalleryActivity.setButtonsClickListeners$lambda$6$lambda$2(GalleryActivity.this, view);
            }
        });
        eccActivityGalleryBinding.searchPhoto.setOnClickListener(new View.OnClickListener() { // from class: ec4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GalleryActivity.setButtonsClickListeners$lambda$6$lambda$3(GalleryActivity.this, view);
            }
        });
        eccActivityGalleryBinding.cancel.setOnClickListener(new View.OnClickListener() { // from class: fc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GalleryActivity.setButtonsClickListeners$lambda$6$lambda$4(GalleryActivity.this, view);
            }
        });
        eccActivityGalleryBinding.send.setOnClickListener(new View.OnClickListener() { // from class: gc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GalleryActivity.setButtonsClickListeners$lambda$6$lambda$5(GalleryActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setButtonsClickListeners$lambda$6$lambda$1(GalleryActivity galleryActivity, View view) {
        z65.h(galleryActivity, "this$0");
        galleryActivity.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setButtonsClickListeners$lambda$6$lambda$2(GalleryActivity galleryActivity, View view) {
        z65.h(galleryActivity, "this$0");
        galleryActivity.clearSearch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setButtonsClickListeners$lambda$6$lambda$3(GalleryActivity galleryActivity, View view) {
        z65.h(galleryActivity, "this$0");
        galleryActivity.showSearch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setButtonsClickListeners$lambda$6$lambda$4(GalleryActivity galleryActivity, View view) {
        z65.h(galleryActivity, "this$0");
        galleryActivity.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setButtonsClickListeners$lambda$6$lambda$5(GalleryActivity galleryActivity, View view) {
        z65.h(galleryActivity, "this$0");
        galleryActivity.send();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showBucketListState() {
        this.screenState.d(ScreenState.BUCKET_LIST);
        this.chosenItems.clear();
        String string = getResources().getString(R.string.ecc_photos);
        z65.g(string, "resources.getString(R.string.ecc_photos)");
        EccActivityGalleryBinding eccActivityGalleryBinding = null;
        BaseActivity.setTitle$default(this, string, null, 2, null);
        EccActivityGalleryBinding eccActivityGalleryBinding2 = this.binding;
        if (eccActivityGalleryBinding2 == null) {
            z65.z("binding");
            eccActivityGalleryBinding2 = null;
        }
        eccActivityGalleryBinding2.recycler.removeItemDecoration(this.galleryDecorator);
        EccActivityGalleryBinding eccActivityGalleryBinding3 = this.binding;
        if (eccActivityGalleryBinding3 == null) {
            z65.z("binding");
            eccActivityGalleryBinding3 = null;
        }
        eccActivityGalleryBinding3.recycler.addItemDecoration(this.bucketsGalleryDecorator);
        EccActivityGalleryBinding eccActivityGalleryBinding4 = this.binding;
        if (eccActivityGalleryBinding4 == null) {
            z65.z("binding");
            eccActivityGalleryBinding4 = null;
        }
        eccActivityGalleryBinding4.recycler.setLayoutManager(new GridLayoutManager(this, 2));
        EccActivityGalleryBinding eccActivityGalleryBinding5 = this.binding;
        if (eccActivityGalleryBinding5 == null) {
            z65.z("binding");
        } else {
            eccActivityGalleryBinding = eccActivityGalleryBinding5;
        }
        eccActivityGalleryBinding.recycler.setAdapter(new PhotoBucketsGalleryAdapter(this.bucketItems, this));
        this.dataIsEmpty.d(Boolean.valueOf(this.bucketItems.isEmpty()));
    }

    private final void showPhotoListState(String str, PhotoBucketItem photoBucketItem) {
        List<MediaPhoto> list;
        this.screenState.d(ScreenState.PHOTO_LIST);
        this.chosenItems.clear();
        syncSendButtonState();
        EccActivityGalleryBinding eccActivityGalleryBinding = null;
        BaseActivity.setTitle$default(this, str, null, 2, null);
        EccActivityGalleryBinding eccActivityGalleryBinding2 = this.binding;
        if (eccActivityGalleryBinding2 == null) {
            z65.z("binding");
            eccActivityGalleryBinding2 = null;
        }
        eccActivityGalleryBinding2.recycler.removeItemDecoration(this.bucketsGalleryDecorator);
        EccActivityGalleryBinding eccActivityGalleryBinding3 = this.binding;
        if (eccActivityGalleryBinding3 == null) {
            z65.z("binding");
            eccActivityGalleryBinding3 = null;
        }
        eccActivityGalleryBinding3.recycler.addItemDecoration(this.galleryDecorator);
        EccActivityGalleryBinding eccActivityGalleryBinding4 = this.binding;
        if (eccActivityGalleryBinding4 == null) {
            z65.z("binding");
            eccActivityGalleryBinding4 = null;
        }
        eccActivityGalleryBinding4.recycler.setLayoutManager(new GridLayoutManager(this, 3));
        Iterator<List<MediaPhoto>> it = this.photosMap.values().iterator();
        while (true) {
            boolean z = false;
            if (it.hasNext()) {
                list = it.next();
                if (z65.c(list.get(0).getImageUri(), photoBucketItem.getImagePath())) {
                    break;
                }
            } else {
                list = null;
                break;
            }
        }
        if (list != null) {
            for (MediaPhoto mediaPhoto : list) {
                mediaPhoto.setChecked(false);
            }
        }
        EccActivityGalleryBinding eccActivityGalleryBinding5 = this.binding;
        if (eccActivityGalleryBinding5 == null) {
            z65.z("binding");
        } else {
            eccActivityGalleryBinding = eccActivityGalleryBinding5;
        }
        eccActivityGalleryBinding.recycler.setAdapter(new GalleryAdapter(list, this));
        List<MediaPhoto> list2 = list;
        this.dataIsEmpty.d(Boolean.valueOf((list2 == null || list2.isEmpty()) ? true : true));
    }

    private final void showSearchState() {
        this.screenState.d(ScreenState.SEARCH);
        this.chosenItems.clear();
        syncSendButtonState();
        EccActivityGalleryBinding eccActivityGalleryBinding = this.binding;
        if (eccActivityGalleryBinding == null) {
            z65.z("binding");
            eccActivityGalleryBinding = null;
        }
        eccActivityGalleryBinding.searchEditText.requestFocus();
        EccActivityGalleryBinding eccActivityGalleryBinding2 = this.binding;
        if (eccActivityGalleryBinding2 == null) {
            z65.z("binding");
            eccActivityGalleryBinding2 = null;
        }
        eccActivityGalleryBinding2.recycler.removeItemDecoration(this.bucketsGalleryDecorator);
        EccActivityGalleryBinding eccActivityGalleryBinding3 = this.binding;
        if (eccActivityGalleryBinding3 == null) {
            z65.z("binding");
            eccActivityGalleryBinding3 = null;
        }
        eccActivityGalleryBinding3.recycler.addItemDecoration(this.galleryDecorator);
        EccActivityGalleryBinding eccActivityGalleryBinding4 = this.binding;
        if (eccActivityGalleryBinding4 == null) {
            z65.z("binding");
            eccActivityGalleryBinding4 = null;
        }
        eccActivityGalleryBinding4.recycler.setLayoutManager(new GridLayoutManager(this, 3));
        EccActivityGalleryBinding eccActivityGalleryBinding5 = this.binding;
        if (eccActivityGalleryBinding5 == null) {
            z65.z("binding");
            eccActivityGalleryBinding5 = null;
        }
        eccActivityGalleryBinding5.recycler.setAdapter(null);
        this.dataIsEmpty.d(Boolean.TRUE);
    }

    private final void subscribeToDataIsEmpty() {
        wn1 wn1Var = this.compositeDisposable;
        r57<Boolean> m = this.dataIsEmpty.m(ti.c());
        final GalleryActivity$subscribeToDataIsEmpty$1 galleryActivity$subscribeToDataIsEmpty$1 = new GalleryActivity$subscribeToDataIsEmpty$1(this);
        wr1<? super Boolean> wr1Var = new wr1() { // from class: hc4
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                GalleryActivity.subscribeToDataIsEmpty$lambda$18(Function1.this, obj);
            }
        };
        final GalleryActivity$subscribeToDataIsEmpty$2 galleryActivity$subscribeToDataIsEmpty$2 = GalleryActivity$subscribeToDataIsEmpty$2.INSTANCE;
        wn1Var.b(m.p(wr1Var, new wr1() { // from class: ic4
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                GalleryActivity.subscribeToDataIsEmpty$lambda$19(Function1.this, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToDataIsEmpty$lambda$18(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToDataIsEmpty$lambda$19(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final void subscribeToScreenState() {
        wn1 wn1Var = this.compositeDisposable;
        r57<ScreenState> m = this.screenState.m(ti.c());
        final GalleryActivity$subscribeToScreenState$1 galleryActivity$subscribeToScreenState$1 = new GalleryActivity$subscribeToScreenState$1(this);
        wr1<? super ScreenState> wr1Var = new wr1() { // from class: jc4
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                GalleryActivity.subscribeToScreenState$lambda$16(Function1.this, obj);
            }
        };
        final GalleryActivity$subscribeToScreenState$2 galleryActivity$subscribeToScreenState$2 = GalleryActivity$subscribeToScreenState$2.INSTANCE;
        wn1Var.b(m.p(wr1Var, new wr1() { // from class: kc4
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                GalleryActivity.subscribeToScreenState$lambda$17(Function1.this, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToScreenState$lambda$16(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToScreenState$lambda$17(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final void syncSendButtonState() {
        EccActivityGalleryBinding eccActivityGalleryBinding = null;
        if (this.chosenItems.size() > 0) {
            EccActivityGalleryBinding eccActivityGalleryBinding2 = this.binding;
            if (eccActivityGalleryBinding2 == null) {
                z65.z("binding");
                eccActivityGalleryBinding2 = null;
            }
            eccActivityGalleryBinding2.send.setEnabled(true);
            EccActivityGalleryBinding eccActivityGalleryBinding3 = this.binding;
            if (eccActivityGalleryBinding3 == null) {
                z65.z("binding");
            } else {
                eccActivityGalleryBinding = eccActivityGalleryBinding3;
            }
            eccActivityGalleryBinding.send.setTextColor(iu1.c(this, 17170443));
            return;
        }
        EccActivityGalleryBinding eccActivityGalleryBinding4 = this.binding;
        if (eccActivityGalleryBinding4 == null) {
            z65.z("binding");
            eccActivityGalleryBinding4 = null;
        }
        eccActivityGalleryBinding4.send.setEnabled(false);
        EccActivityGalleryBinding eccActivityGalleryBinding5 = this.binding;
        if (eccActivityGalleryBinding5 == null) {
            z65.z("binding");
        } else {
            eccActivityGalleryBinding = eccActivityGalleryBinding5;
        }
        eccActivityGalleryBinding.send.setTextColor(iu1.c(this, R.color.ecc_disabled_text_color));
    }

    public final void clearSearch() {
        EccActivityGalleryBinding eccActivityGalleryBinding = this.binding;
        if (eccActivityGalleryBinding == null) {
            z65.z("binding");
            eccActivityGalleryBinding = null;
        }
        eccActivityGalleryBinding.searchEditText.setText("");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (ScreenState.BUCKET_LIST != this.screenState.A()) {
            EccActivityGalleryBinding eccActivityGalleryBinding = this.binding;
            if (eccActivityGalleryBinding == null) {
                z65.z("binding");
                eccActivityGalleryBinding = null;
            }
            eccActivityGalleryBinding.searchEditText.setText("");
            showBucketListState();
            return;
        }
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // im.threads.ui.activities.BaseActivity, androidx.fragment.app.d, androidx.activity.ComponentActivity, defpackage.gm1, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EccActivityGalleryBinding inflate = EccActivityGalleryBinding.inflate(getLayoutInflater());
        z65.g(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        if (inflate == null) {
            z65.z("binding");
            inflate = null;
        }
        setContentView(inflate.getRoot());
        initViews();
        subscribeToScreenState();
        subscribeToDataIsEmpty();
        initStatusBar();
        sh0.d(this.coroutineScope, null, null, new GalleryActivity$onCreate$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.c, androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.compositeDisposable.e();
    }

    @Override // im.threads.ui.adapters.GalleryAdapter.OnGalleryItemClick
    public void onGalleryItemsChosen(List<MediaPhoto> list) {
        z65.h(list, "chosenItems");
        this.chosenItems.clear();
        this.chosenItems.addAll(list);
        syncSendButtonState();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        z65.h(menuItem, "item");
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // im.threads.ui.adapters.PhotoBucketsGalleryAdapter.OnItemClick
    public void onPhotoBucketClick(PhotoBucketItem photoBucketItem) {
        z65.h(photoBucketItem, "item");
        showPhotoListState(photoBucketItem.getBucketName(), photoBucketItem);
    }

    public final void send() {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (MediaPhoto mediaPhoto : this.chosenItems) {
            arrayList.add(mediaPhoto.getImageUri());
        }
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra(PHOTOS_TAG, arrayList);
        setResult(-1, intent);
        finish();
    }

    public final void showSearch() {
        showSearchState();
        search("");
    }
}
