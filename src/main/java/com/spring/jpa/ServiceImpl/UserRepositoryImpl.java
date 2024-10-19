// package com.spring.jpa.ServiceImpl;


// import java.util.List;
// import java.util.Optional;
// import java.util.function.Function;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.domain.Example;
// import org.springframework.data.domain.Page;
// import org.springframework.data.domain.Pageable;
// import org.springframework.data.domain.Sort;
// import org.springframework.data.repository.query.FluentQuery;
// import org.springframework.stereotype.Service;

// import com.spring.jpa.Entity.User;
// import com.spring.jpa.Repository.UserRepository;

// @Service
// public class UserRepositoryImpl implements UserRepository {

//     @Autowired
//     private UserRepository userRepository;

//     @Override
//     public List<User> getAllUsers() {
//         return userRepository.findAll();
//     }

//     @Override
//     public User createUser(User user) {
//         return userRepository.save(user);
//     }

//     // @Override
//     // public String deleteUser(Long id) {
//     //     userRepository.deleteById(id);
//     //     return "User deleted successfully";
//     // }

//     // @Override
//     // public Optional<User> getUserById(Long id) {
//     //     return userRepository.findAll(id);
//     // }
    
//     // public String updateUser(Long id, User user) {
//     //     // Fetch the user by ID
//     //     User existingUser = userRepository.findAll(id).orElse(null);

//     //     if (existingUser == null) {
//     //         return "User not found"; // Return message if user doesn't exist
//     //     }

//     //     // Update fields
//     //     existingUser.setName(user.getName());
//     //     existingUser.setEmail(user.getEmail());

//     //     // Save updated user
//     //     userRepository.save(existingUser);

//     //     return "User updated successfully"; // Return success message
//     // }

//     // @Override
//     // public void flush() {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public <S extends User> S saveAndFlush(S entity) {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public <S extends User> List<S> saveAllAndFlush(Iterable<S> entities) {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public void deleteAllInBatch(Iterable<User> entities) {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public void deleteAllByIdInBatch(Iterable<Integer> ids) {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public void deleteAllInBatch() {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public User getOne(Integer id) {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public User getById(Integer id) {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public User getReferenceById(Integer id) {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public <S extends User> List<S> findAll(Example<S> example) {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public <S extends User> List<S> findAll(Example<S> example, Sort sort) {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public <S extends User> List<S> saveAll(Iterable<S> entities) {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public List<User> findAll() {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public List<User> findAllById(Iterable<Integer> ids) {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public <S extends User> S save(S entity) {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public Optional<User> findById(Integer id) {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public boolean existsById(Integer id) {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public long count() {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public void deleteById(Integer id) {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public void delete(User entity) {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public void deleteAllById(Iterable<? extends Integer> ids) {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public void deleteAll(Iterable<? extends User> entities) {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public void deleteAll() {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public List<User> findAll(Sort sort) {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public Page<User> findAll(Pageable pageable) {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public <S extends User> Optional<S> findOne(Example<S> example) {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public <S extends User> Page<S> findAll(Example<S> example, Pageable pageable) {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public <S extends User> long count(Example<S> example) {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public <S extends User> boolean exists(Example<S> example) {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }

//     // @Override
//     // public <S extends User, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
//     //     throw new UnsupportedOperationException("Not supported yet.");
//     // }
// }

