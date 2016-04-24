package com.pet.spring.security.dto

import groovy.transform.EqualsAndHashCode

/**
 * Simple DTO
 *
 * @author Oleksandr Ivanov
 */
@EqualsAndHashCode
class MasterDTO {
    String username
    String password
    UUID id
}
