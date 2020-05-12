package xupt.se.ttms.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Movie {
    private Integer movieId;

    private String movieName;

    private String movieImage;

    private String movieType;

    private Date movieStartTime;

    private Date movieEndTime;

    private BigDecimal movieSale;

    private BigDecimal moviePrice;

    private String movieIntroduction;

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName == null ? null : movieName.trim();
    }

    public String getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(String movieImage) {
        this.movieImage = movieImage == null ? null : movieImage.trim();
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType == null ? null : movieType.trim();
    }

    public Date getMovieStartTime() {
        return movieStartTime;
    }

    public void setMovieStartTime(Date movieStartTime) {
        this.movieStartTime = movieStartTime;
    }

    public Date getMovieEndTime() {
        return movieEndTime;
    }

    public void setMovieEndTime(Date movieEndTime) {
        this.movieEndTime = movieEndTime;
    }

    public BigDecimal getMovieSale() {
        return movieSale;
    }

    public void setMovieSale(BigDecimal movieSale) {
        this.movieSale = movieSale;
    }

    public BigDecimal getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(BigDecimal moviePrice) {
        this.moviePrice = moviePrice;
    }

    public String getMovieIntroduction() {
        return movieIntroduction;
    }

    public void setMovieIntroduction(String movieIntroduction) {
        this.movieIntroduction = movieIntroduction == null ? null : movieIntroduction.trim();
    }
}