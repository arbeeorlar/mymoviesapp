package com.app.mymoviesapp.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/app/mymoviesapp/data/api/RetrofitService;", "", "getAllMovies", "Lretrofit2/Call;", "", "Lcom/app/mymoviesapp/data/model/Movie;", "Companion", "app_debug"})
public abstract interface RetrofitService {
    @org.jetbrains.annotations.NotNull()
    public static final com.app.mymoviesapp.data.api.RetrofitService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movielist.json")
    public abstract retrofit2.Call<java.util.List<com.app.mymoviesapp.data.model.Movie>> getAllMovies();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/app/mymoviesapp/data/api/RetrofitService$Companion;", "", "()V", "retrofitService", "Lcom/app/mymoviesapp/data/api/RetrofitService;", "getRetrofitService", "()Lcom/app/mymoviesapp/data/api/RetrofitService;", "setRetrofitService", "(Lcom/app/mymoviesapp/data/api/RetrofitService;)V", "getInstance", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.Nullable()
        private static com.app.mymoviesapp.data.api.RetrofitService retrofitService;
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.app.mymoviesapp.data.api.RetrofitService getRetrofitService() {
            return null;
        }
        
        public final void setRetrofitService(@org.jetbrains.annotations.Nullable()
        com.app.mymoviesapp.data.api.RetrofitService p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.app.mymoviesapp.data.api.RetrofitService getInstance() {
            return null;
        }
    }
}