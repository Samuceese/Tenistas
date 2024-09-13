package tenista.services

import tenista.models.Tenista

interface TenistasService {
    fun getAll(): Result<List<Tenista>, TenistaError>
}