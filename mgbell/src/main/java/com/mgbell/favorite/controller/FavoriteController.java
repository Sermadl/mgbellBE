package com.mgbell.favorite.controller;

import com.mgbell.favorite.model.dto.request.FavoriteRequest;
import com.mgbell.favorite.model.dto.response.FavoriteResponse;
import com.mgbell.favorite.service.FavoriteService;
import com.mgbell.global.auth.jwt.JwtAuthentication;
import com.mgbell.global.config.swagger.UserAuth;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/favorite")
@RequiredArgsConstructor
public class FavoriteController {
    private final FavoriteService favoriteService;

    @UserAuth
    @PostMapping
    public void favoriteUpdate(@RequestBody FavoriteRequest request, JwtAuthentication auth) {
        favoriteService.favoriteUpdate(request, auth.getUserId());
    }

    @UserAuth
    @GetMapping
    public ResponseEntity<Page<FavoriteResponse>> getFavorites(Pageable pageable, JwtAuthentication auth) {
        return ResponseEntity.ok(favoriteService.getFavoriteList(pageable, auth.getUserId()));
    }
}
