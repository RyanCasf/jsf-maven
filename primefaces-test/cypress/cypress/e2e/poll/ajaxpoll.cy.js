describe('Ajax Poll', () => {

    beforeEach(() => {
        cy.visit('ajax_poll.jsf')
    })

    it('Página ao abrir.', () => {
        cy.title().should('be.equals', 'Ajax Poll')
    })
})