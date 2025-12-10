package com.example.test_lab_week_12.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'\u00a8\u0006\b"}, d2 = {"Lcom/example/test_lab_week_12/database/MovieDao;", "", "addMovies", "", "movies", "", "Lcom/example/test_lab_week_12/model/Movie;", "getMovies", "app_debug"})
@androidx.room.Dao()
public abstract interface MovieDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void addMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.test_lab_week_12.model.Movie> movies);
    
    @androidx.room.Query(value = "SELECT * FROM movies")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.test_lab_week_12.model.Movie> getMovies();
}