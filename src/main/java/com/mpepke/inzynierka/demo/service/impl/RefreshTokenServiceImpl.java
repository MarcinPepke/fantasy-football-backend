package com.mpepke.inzynierka.demo.service.impl;

import com.mpepke.inzynierka.demo.model.RefreshToken;
import com.mpepke.inzynierka.demo.model.User;
import com.mpepke.inzynierka.demo.repository.RefreshTokenRepository;
import com.mpepke.inzynierka.demo.service.RefreshTokenService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Transactional
@RequiredArgsConstructor
@Service
public class RefreshTokenServiceImpl implements RefreshTokenService {

    private final RefreshTokenRepository repository;

    @Override
    public Optional<RefreshToken> findByUser(User user) {
        return repository.findByUser(user);
    }

    @Override
    public RefreshToken save(RefreshToken refreshToken) {
        return repository.save(refreshToken);
    }

    @Override
    public Optional<RefreshToken> findByToken(String token) {
        return repository.findByToken(token);
    }

    @Override
    public void deleteToken(RefreshToken refreshToken) {
        repository.delete(refreshToken);
    }
}
