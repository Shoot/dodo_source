package com.inappstory.sdk.game.cache;

import com.inappstory.sdk.network.NetworkCallback;
import com.inappstory.sdk.network.NetworkClient;
import com.inappstory.sdk.stories.api.models.GameCenterData;
import com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback;
import com.inappstory.sdk.stories.utils.SessionManager;
import java.lang.reflect.Type;
import java.util.HashMap;
/* loaded from: classes3.dex */
public class GameCacheManager {
    HashMap<String, CachedGame> cachedGames = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements OpenSessionCallback {
        final /* synthetic */ String a;
        final /* synthetic */ GameLoadCallback b;

        /* renamed from: com.inappstory.sdk.game.cache.GameCacheManager$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0255a extends NetworkCallback<GameCenterData> {
            C0255a() {
            }

            @Override // com.inappstory.sdk.network.Callback
            /* renamed from: a */
            public void onSuccess(GameCenterData gameCenterData) {
                String str;
                String str2 = gameCenterData.url;
                if (str2 != null && !str2.isEmpty() && (str = gameCenterData.initCode) != null && !str.isEmpty()) {
                    a aVar = a.this;
                    GameCacheManager.this.cachedGames.put(aVar.a, new CachedGame(gameCenterData));
                    a.this.b.onSuccess(gameCenterData);
                    return;
                }
                a.this.b.onError("Invalid game data");
            }

            @Override // com.inappstory.sdk.network.Callback
            public Type getType() {
                return GameCenterData.class;
            }

            @Override // com.inappstory.sdk.network.NetworkCallback
            public void onError(int i, String str) {
                super.onError(i, str);
                a.this.b.onError(str);
            }

            @Override // com.inappstory.sdk.network.NetworkCallback
            public void onTimeout() {
                super.onTimeout();
                a.this.b.onError("Game loading run out of time");
            }
        }

        a(String str, GameLoadCallback gameLoadCallback) {
            this.a = str;
            this.b = gameLoadCallback;
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback
        public void onError() {
            this.b.onError("Open session error");
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback
        public void onSuccess() {
            NetworkClient.getApi().getGameByInstanceId(this.a).enqueue(new C0255a());
        }
    }

    private void getGameFromGameCenter(String str, GameLoadCallback gameLoadCallback) {
        SessionManager.getInstance().useOrOpenSession(new a(str, gameLoadCallback));
    }

    public void clearGames() {
        this.cachedGames.clear();
    }

    public GameCenterData getCachedGame(String str) {
        CachedGame cachedGame = this.cachedGames.get(str);
        if (cachedGame != null) {
            return cachedGame.data;
        }
        return null;
    }

    public void getGame(String str, GameLoadCallback gameLoadCallback) {
        getGameFromGameCenter(str, gameLoadCallback);
    }
}
